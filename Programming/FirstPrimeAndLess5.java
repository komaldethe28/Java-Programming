import java.util.Scanner;
class FirstPrimeAndLess5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;
        while(num!=0){
            ld=num%10;
            if(ld==2 || ld==3){
                System.out.println("Print first prime and odd digit: "+ld);
                break;
            }
            num/=10;
        }
    }
}
