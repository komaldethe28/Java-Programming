// 49. Print the first digit greater than 4.
import java.util.Scanner;
class FirstDigitAndGre4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;
        while(num!=0){
            ld=num%10;
            if(ld>4){
                System.out.println("First digit greater than 4: "+ld);
                break;
            }
            num/=10;
        }
    }
}
