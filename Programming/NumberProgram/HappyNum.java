import java.util.Scanner;
class HappyNum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        
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
        if(num==1)
            System.out.println("its a Happy number...");
        else
            System.out.println("its not a Happy number...");
    }
}
