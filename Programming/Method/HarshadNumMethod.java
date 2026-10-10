import java.util.Scanner;
class HarshadNumMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        boolean flag= Harshad(num);

         if(flag){
                System.out.println(" is harshad number");
            }else{
                System.out.println(" is not harshad number");
            }
        }

        public static boolean Harshad(int num){
            int temp= num;
            int sum=0;
            int lastDigit=0;

            while(num>0){
                lastDigit=num%10;
                sum=sum+lastDigit;
                num=num/10;
            }
           
           return temp%sum==0;
        }
}
