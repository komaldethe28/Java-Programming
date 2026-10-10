import java.util.Scanner;
class HarshadNum{
public static void main(String [] args ){
	System.out.print("Enter a num:");
	Scanner sc= new Scanner (System.in);
	int num= sc.nextInt();

	int temp= num;
	int sum=0;
	int lastDigit=0;

	while(num>0){
		lastDigit=num%10;
		sum=sum+lastDigit;
		num=num/10;
		}
		if(temp%sum==0){
			System.out.println(temp+ " is harshad number");
		}else{
				System.out.println(temp+ " is not harshad number");

		}
	}
}