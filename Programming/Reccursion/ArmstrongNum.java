import java.util.Scanner;
class ArmstrongNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		
		System.out.println("is strong number- " +isStrong(num));
	}

	public static int fact(int num, int fact){
		if(num==1){
			return fact;
		}
		return fact(num-1, fact*num);
	}

	public static int factSum(int num, int sum){
		if(num==0){
			return sum;
		}
		int fact=fact(num%10,1);
		return factSum(num/10, sum+fact);
	}

	public static boolean isStrong(int num){
		int sum=factSum(num,0);
		return num==sum;
	}
}