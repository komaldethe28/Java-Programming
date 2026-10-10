import java.util.Scanner;
class NeonNum {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int squre=num*num;
        int sum=0;
        int lastDigit=0;

        while(squre!=0){
            lastDigit=squre%10;
            sum=sum+lastDigit;
            squre=squre/10;
        }

        if (sum==num) {
            System.out.println(num+ " is Neon number");
        } else {
            System.out.println(num+ " is not a Neon number");
        }
    }
}
