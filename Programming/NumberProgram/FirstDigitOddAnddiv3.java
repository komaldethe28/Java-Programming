// Print the first digit which is odd and divisible by 3.
import java.util.Scanner;
class FirstDigitOddAnddiv3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
        	ld=num%10;
        	if(ld%2!=0 && ld%3==0){
        		System.out.println("First Odd Digit and divisible by 3: "+ld);
        		break;
        	}
        	num/=10;
        }
    }
}
