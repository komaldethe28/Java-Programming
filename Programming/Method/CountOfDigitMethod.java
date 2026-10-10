import java.util.Scanner;
class CountOfDigitMethod{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int res = DigitCount(num);
        System.out.println(res);
    }
    public static int DigitCount(int num){
        int count=0;
        int ld=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
