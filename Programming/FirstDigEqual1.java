// Print the first digit equal to 1.
import java.util.Scanner;
class FirstDigEqual1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;

        while(num!=0){
            ld=num%10;
            if(ld==1){
                System.out.println(ld);
                break;
            }
            num/=10;
        }
    }
}