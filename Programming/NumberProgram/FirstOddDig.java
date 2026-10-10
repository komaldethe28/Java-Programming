// Print first odd digit in a given number
import java.util.Scanner;
class FirstOddDig{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
            ld=num%10;
            if(ld%2!=0){
                System.out.println("First Odd Digit: "+ld);
                break;
            }
            num/=10;
        }
    }
}