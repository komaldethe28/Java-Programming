import java.util.Scanner;
class tech_number{
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
            if (count % 2 != 0) {
                continue;
            }
            int divisor = 1;
            for (int i = 1; i <= count / 2; i++) {
                divisor = divisor * 10;
            }
            int first = num / divisor;
            int second = num % divisor;
            int sum = first + second;
            int square = sum * sum;
            if (square == num) {
                System.out.println(num);
            }
        }
    }
}