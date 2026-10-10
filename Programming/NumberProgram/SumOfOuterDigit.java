import java.util.Scanner;
class SumOfOuterDigit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        
        int outerD=0;
        int ld=num%10;
        outerD=outerD+ld;

        while(num>9){
            num/=10;
        }
        outerD+=num;
        System.out.println("Outer Digits Sum:"+outerD);
    }
}