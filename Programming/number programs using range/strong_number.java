import java.util.Scanner;
class strong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                int factorial = 1;
                for (int i = 1; i <= digit; i++) {
                    factorial = factorial * i;
                }
                sum = sum + factorial;
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}