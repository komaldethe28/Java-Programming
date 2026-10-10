import java.util.Scanner;
class perfect_square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    System.out.println("Perfect square: " + num);
                    break;
                }
            }
        }
    }
}