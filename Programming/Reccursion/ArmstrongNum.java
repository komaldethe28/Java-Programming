import java.util.Scanner;
class ArmstrongNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		
		int count=cod(num,0);
		if (isArmst(num,num,count,0)) {
			System.out.println("Armstrong Num");
		}else{
			System.out.println("Not Armstrong Num");
		}
	}
	public static int cod(int num, int count){
		if(num==0){
			return count;
		}
		return cod(num/10, ++count);
	}
	public static int power(int base,int power, int res){
		if(power==0){
			return res;
		}
		return power(base, power-1,res*base);
	}
	public static boolean isArmst(int num, int temp,int count, int sum){
		if(temp==0){
			return num==sum;
		}
		int power= power(temp%10, count, 1);
		return isArmst(num,temp/10,count,sum+power);
	}
	

}