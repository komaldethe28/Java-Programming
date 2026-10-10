import java.util.Scanner;
class neon_range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for (int num = start; num <= end; num++) {
            int square = num * num;
            int sum = 0;
            while (square > 0) {
                int digit = square % 10;
                sum = sum + digit;
                square = square / 10;
            }
            if (sum == num) {
                System.out.println("Neon number: " + num);
            }
        }
    }
}