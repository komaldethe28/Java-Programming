import java.util.Scanner;
class TechNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		int count=count(num,0);
		if (count %2==0) {
			boolean ans=isTech(num, count/2);
			if(ans){
				System.out.println("is tech number");
			}else{
				System.out.println("is not tech number");
			}
		}else{
			System.out.println("not even and tech number");
		}
	}
	public static int count(int num, int count){
		if(num==0){
			return count;
		}
		return count(num/10, count+1);
	}

	public static int power(int power, int res){
		if(power==0){
			return res;
		}
		return power(power-1, res*10);
	}
	public static boolean isTech(int num, int count){
		int devide= power(count,1);
		System.out.println("divide: "+devide);
		int fh=num%devide;
		int sh=num/devide;
		int sum=fh+sh;
		return sum*sum==num;
	}
}