import java.util.Scanner;
class PerfectMehod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean ans=isPerfect(num);
        if (ans) {
            System.out.println("It is Perfect Number");
        } else {
            System.out.println("It is not a Perfect Number");
        }
    }
    public static boolean isPerfect(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if (num%i==0) {
                sum=sum+i;
            }
        }
        return sum==num;
    }
}
