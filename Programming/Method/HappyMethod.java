import java.util.Scanner;
class HappyMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        boolean ans=isHappy(num);
        if(ans)
            System.out.println("its a Happy number...");
        else
            System.out.println("its not a Happy number...");
    }
    public static boolean isHappy(int num ){
        do{
            int sum=0;
            while(num>0){
                int ld=num%10;
                sum=sum+(ld*ld);
                num/=10;  
            }
            num=sum;
        }
        while(num>9);
        return num==1;
    }
}