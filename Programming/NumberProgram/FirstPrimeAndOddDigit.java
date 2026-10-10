import java.util.Scanner;
class FirstPrimeAndOddDigit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;
        while(num!=0){
            ld=num%10;
            if(ld==3 || ld==5 || ld==7){
                System.out.println("Print first prime and odd digit: "+ld);
                break;
            }
            num/=10;
        }
    }
}
