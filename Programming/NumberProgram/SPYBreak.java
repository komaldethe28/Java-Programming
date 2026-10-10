import java.util.Scanner;
class SPYBreak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range1: ");
        int Range1 = sc.nextInt();
        System.out.print("Enter a Range2: ");
        int Range2 = sc.nextInt();

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