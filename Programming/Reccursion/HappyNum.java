import java.util.Scanner;
class HappyNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0 && isHappy(num, num, 0)) {
            System.out.println("its a Happy number...");
        } else {
            System.out.println("its not a Happy number...");
        }
    }

    public static boolean isHappy(int num, int temp, int sum) {
        if (temp == 0) {
            if (sum == 1) {
                return true;
            }
            if (sum < 10) {
                return false;
            }
            return isHappy(sum, sum, 0);
        }

        int ld = temp % 10;
        return isHappy(num, temp / 10, sum + ld * ld);
    }
}