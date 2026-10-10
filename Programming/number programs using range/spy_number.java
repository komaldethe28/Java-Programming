import java.util.Scanner;
class spy_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            int product = 1;
            
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit;
                product = product * digit;
                temp = temp / 10;
            }
            if (sum == product) {
                System.out.println(num);
            }
        }
    }
}