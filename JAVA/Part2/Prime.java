import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean op = isPrime(num, 2);
        System.out.print(op ? num + " is Prime" : num + " is not Prime");
    }

    public static boolean isPrime(int num, int i) {
        if (num < 2)
            return false;
        if (i > num / 2)
            return true;
        if (num % i == 0)
            return false;
        return isPrime(num, i + 1);
    }
}