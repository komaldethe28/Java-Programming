import java.util.Scanner;
class NeonMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean ans=neonNumber(num);
        if (ans) {
            System.out.println("its NEON number");
        }else{
            System.out.println("Its not NEON number");
        }
    }
    public static boolean neonNumber(int num){
        int squre=num*num;
        int sum=0;
        int lastDigit=0;

        while(squre!=0){
            lastDigit=squre%10;
            sum=sum+lastDigit;
            squre=squre/10;
        }

        return sum==num;
    }
}
