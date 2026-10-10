import java.util.Scanner;
class PerfectNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int sum=0;
        for(int i=1;i<=num/2;i++){
            if (num%i==0) {
                sum=sum+i;
            }
        }
        if (sum==num) {
            System.out.println("It is Perfect Number");
        } else {
            System.out.println("It is not a Perfect Number");
        }
    }    
}
