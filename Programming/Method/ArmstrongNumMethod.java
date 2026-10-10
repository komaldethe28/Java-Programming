import java.util.Scanner;
class ArmstrongNumMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int temp=num;

        int count=0;    
        while(num!=0){
            count++;
            num/=10;
        }
        num=temp;
        if(isArmstrong(num,count,temp))
            System.out.println(temp+" number is ArmstrongNum");
        else
            System.out.println(temp+" number is not ArmstrongNum");
    }
    public static boolean isArmstrong(int num, int count,int temp){
        int sum=0;
        while(num>0){
            int ld=num%10;
            int res=1;
            for(int i=1; i<=count; i++){
                res=res*ld;  
            }
            sum=sum+res;
            num=num/10;
        }
        return sum==temp;
    }
}