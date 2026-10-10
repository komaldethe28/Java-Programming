// Print the first non-zero digit.
import java.util.Scanner;
class FirstNon0Digit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
        	ld=num%10;
        	if(ld>0){
        		System.out.println("first non-zero digit : "+ld);
        		break;
        	}
        	num/=10;
        }
    }
}