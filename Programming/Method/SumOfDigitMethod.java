import java.util.Scanner;
class SumOfDigitMethod{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int res = SumofDigit(num);
        System.out.println(res);
    }
    public static int SumofDigit(int num){
        int sum=0;
        int ld=0;
        while(num>0){
            ld=num%10;
            sum+=ld;
            num/=10;
        }
        return sum;
    }
}