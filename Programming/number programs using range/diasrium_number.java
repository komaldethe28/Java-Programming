import java.util.Scanner;
class diasrium_number{
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
            temp = num;
            int sum = 0;
            while (temp > 0) {
                int lastdigit = temp % 10;
                int power = 1;
                for (int i = 1; i <= count; i++) {
                    power = power * lastdigit;
                }
                sum = sum + power;
                count--;
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.println("disarium number-" + num);
            }
        }
    }
}