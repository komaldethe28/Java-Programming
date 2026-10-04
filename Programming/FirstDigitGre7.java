// Print the first digit greater than 7.
import java.util.Scanner;
class FirstDigitGre7{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
        	ld=num%10;
        	if(ld>7){
        		System.out.println("first digit greater than 7 : "+ld);
        		break;
        	}
        	num/=10;
        }
    }
}