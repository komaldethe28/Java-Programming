import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = sumDigit(num,0);
        System.out.println("Sum of digits is: " + sum);
    }

    public static int sumDigit(int num, int sum) {
        if (num == 0) return sum;
        
        int digit = num % 10;
        sum=sum+digit;
	num=num/10;
        return sumDigit(num, sum);
    }
}