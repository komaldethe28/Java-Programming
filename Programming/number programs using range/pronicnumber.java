import java.util.Scanner;
class pronicnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            for (int i = 1; i * (i + 1) <= num; i++) {
                if (i * (i + 1) == num) {
                    System.out.println("Pronic number: " + num);
                    break;
                }
            }
        }
    }
}
