import java.util.Scanner;
class sunny_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int num = start; num <= end; num++) {
            int n = num + 1;
            for (int i = 1; i * i <= n; i++) {
                if (i * i == n) {
                    System.out.println("Sunny number: " + num);
                    break;
                }
            }
        }
    }
}
