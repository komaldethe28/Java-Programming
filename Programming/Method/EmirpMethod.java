import java.util.Scanner;
class EmirpMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int revNum = 0;
        while (temp != 0) {
            revNum = revNum * 10 + temp % 10;
            temp /= 10;
        }
        if (isPrime(num) && isPrime(revNum)){
            if (num != revNum) {
                System.out.println("It is an Emirp number");
            } else {
                System.out.println("It is not an Emirp number");
            }
        } else {
           System.out.println("It is not a prime number");
        }
    }
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 0;
    }
}