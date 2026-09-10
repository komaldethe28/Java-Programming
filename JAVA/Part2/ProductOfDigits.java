import java.util.Scanner;
class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int pro = proDigit(num,1);
        System.out.println("Proroduct of digits is: " + pro);
    }

    public static int proDigit(int num, int pro) {
        if (num == 0) return pro;
        
        int digit = num % 10;
        pro=pro*digit;
	num=num/10;
        return proDigit(num, pro);
    }
}