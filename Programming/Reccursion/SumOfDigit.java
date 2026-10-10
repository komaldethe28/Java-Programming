import java.util.Scanner;
class SumOfDigit{
    public static void main(String [] args){
        System.out.println(digitSum(384,0));
    }
    public static int digitSum(int num, int sum){
        if(num==0){
            return sum;
        }
        return digitSum(num/10, sum+num%10);
    }
}