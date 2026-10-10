import java.util.Scanner;
class UglyMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        if(isUgly(num))
            System.out.println("number is ugly number.....");
        else
            System.out.println("number is not ugly number.....");
    }
    public static boolean isUgly(int num){
        while(num%2==0){
            num/=2;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%5==0){
            num/=5;
        }
        return num==1;
    }
}