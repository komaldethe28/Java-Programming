import java.util.Scanner;
class PrimeMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean ans=primeNum(num);
        if (ans) {
            System.out.print("The number is prime");
        } else {
            System.out.print("The number is not prime");
        }

        
    }

    public static boolean primeNum( int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
