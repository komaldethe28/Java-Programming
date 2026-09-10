import java.util.Scanner;
class SumOfEvenDigits{
	public static void main(String [] args ){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=sc.nextInt();
	int sum= evenSum(num,0);
	System.out.println("Sum of Even Digits of number is: " +sum);
	}
public static int evenSum(int num, int sum){
	if(num==0) return sum;

	int digit= num%10;
	if (digit%2==0){
		sum=sum+digit;
		}
	num=num/10;
	return evenSum(num, sum);
	}
}