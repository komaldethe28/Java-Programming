//Reverce a number:
import java.util.Scanner;
class Reverce{

		static int num=0;
		static int reverceNum;
	
	static{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to reverce:");
		num=sc.nextInt();
	}
	static{
		while(num>0){
			reverceNum=reverceNum*10+num%10;
			num/=10;
		}
	}

	public static void main(String[] args) {
		System.out.print("Reverce a number "+ reverceNum);
	}
}