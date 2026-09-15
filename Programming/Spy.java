import java.util.Scanner;
class Spy{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int sum=0;
        int product=1;
        int lastDigit=0;

        while(num!=0){
            lastDigit=num%10;
            sum=sum+lastDigit;
            product=product*lastDigit;
            num=num/10;
        }
        if(sum==product){
            System.out.println("Spy Number.");
        }else{
             System.out.println("Not a Spy Number.");
        }
    }
}