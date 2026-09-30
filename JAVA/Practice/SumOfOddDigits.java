import java.util.Scanner;
class SumOfOddDigits{
	public static void main(String [] args ){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=sc.nextInt();
	int sum= oddSum(num,0);
	System.out.println("Sum of Odd Digits of number is: " +sum);
	}
public static int oddSum(int num, int sum){
	if(num==0) return sum;

	int digit= num%10;
	if (digit%2 !=0){
		sum=sum+digit;
		}
	num=num/10;
	return oddSum(num, sum);
	}
}