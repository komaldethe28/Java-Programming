import java.util.Scanner;
class harshad_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }
            if (num % sum == 0) {
                System.out.println(num);
            }
        }
    }
}