import java.util.Scanner;
class MagicMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        boolean ans=isMagic(num);
        if(ans)
            System.out.println("its a magical number...");
        else
            System.out.println("its not a magical number...");
    }
    public static boolean isMagic(int num){
        do{
            int sum=0;
            while(num>0){
                int ld=num%10;
                sum=sum+ld;
                num/=10;  
            }
            num=sum;
        }
        while(num>9);
        return num==1;
        
    }
}