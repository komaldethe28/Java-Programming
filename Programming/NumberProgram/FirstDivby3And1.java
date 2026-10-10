// print first digit which is divisible by 3 and 1
import java.util.Scanner;
class FirstDivby3And1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
            ld=num%10;
            if(ld%3==0 && ld%1==0){
                System.out.println("First Digit Divisible by 3 & 1: "+ld);
                break;
            }
            num/=10;
        }
    }
}