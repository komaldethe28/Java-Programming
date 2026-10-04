// Print the first digit which is even and greater than 4.
import java.util.Scanner;
class FirstDigitEvenAndGreater4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
            ld=num%10;
            if(ld%2==0 && ld>4){
                System.out.println("First Digit Even And Greater 4 : "+ld);
                break;
            }
            num/=10;
        }
    }
}