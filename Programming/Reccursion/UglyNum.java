import java.util.Scanner;
class UglyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isUgly(num)) {
            System.out.println("number is ugly number.....");
        } else {
            System.out.println("number is not ugly number.....");
        }
    }

    public static boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 2 == 0) {
            return isUgly(num / 2);
        }
        if (num % 3 == 0) {
            return isUgly(num / 3);
        }
        if (num % 5 == 0) {
            return isUgly(num / 5);
        }
    return false;
    }
}