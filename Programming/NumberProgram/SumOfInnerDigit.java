import java.util.Scanner;
class SumOfInnerDigit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        
        num=num/10;
        int sum=0;
       
        while(num>9){
            int ld=num%10;
            sum=sum+ld;
            num=num/10;
        }
        
        System.out.println("Inner Digits Sum:"+sum);
        

    }
}