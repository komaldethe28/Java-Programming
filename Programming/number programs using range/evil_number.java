import java.util.Scanner;
class evil_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for (int num = start; num <= end; num++) {
            int temp = num;
            int count = 0;
            while (temp > 0) {
                int digit = temp % 2;
                if (digit == 1) {
                    count++;
                }
                temp = temp / 2;
            }
            if (count % 2 == 0) {
                System.out.println("evil number-" + num);
            }
        }
    }
}