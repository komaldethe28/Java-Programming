import java.util.Scanner;
class automorphic_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int temp = num;
            int count = 0;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            int divisor = 1;
            for (int i = 1; i <= count; i++) {
                divisor = divisor * 10;
            }
            int square = num * num;
            if (square % divisor == num) {
                System.out.println("automorphic number-" + num);
            }
        }
    }
}