import java.util.Scanner;
class PrimeInRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range1: ");
        int Range1 = sc.nextInt();
        System.out.print("Enter a Range2: ");
        int Range2 = sc.nextInt();

        for (int num = Range1; num <= Range2; num++) {

            if (num <= 1) {
                continue;
            }

            boolean flag = false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(num);
            }
        }
    }
}