import java.util.Scanner;
class CommonFactorOfTwoNum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int gcd=1;
        int smallNum=(num1<num2)?num1:num2;
        for (int i=1;i<=smallNum;i++){
            if(num1%i==0 && num2%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
