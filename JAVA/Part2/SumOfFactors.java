import java.util.Scanner;
class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumFactors(num, 1);
        System.out.println("Sum of factors is: " + sum);
    }

    public static int sumFactors(int num, int i) {
        if (i > num) {
            return 0;
        }
        if (num % i == 0) {
            return i + sumFactors(num, ++i);
        }
        return sumFactors(num, ++i);
    }
}