import java.util.Scanner;
class perfect_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0;
            for (int i = 1 ; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == num) {
                System.out.println("Perfect number: " + num);
            }
        }
    }
}