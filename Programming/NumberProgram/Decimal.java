import java.util.Scanner;
public class Decimal {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int dec=0, ldigit=0, place=1;
        while(num>0){
            ldigit=num%10;
            dec= dec+ldigit*place;
            num/=10;
            place*=2;
        }
        System.out.print("The Decimal number is: " +dec);
    }
}
