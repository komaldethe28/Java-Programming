import java.util.Scanner;
class SpyNum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean flag=spy(num);
          if(flag){
                System.out.println(" is Spy number");
            }else{
                System.out.println(" is not Spy number");
                }
        }

        public static boolean spy(int num){
            int sum=0;
            int product=1;
            int lastDigit=0;

            while(num!=0){
                lastDigit=num%10;
                sum=sum+lastDigit;
                product=product*lastDigit;
                num=num/10;
            }
            return sum==product;
        }
}