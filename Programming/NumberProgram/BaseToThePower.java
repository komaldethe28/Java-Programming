import java.util.Scanner;
class BaseToThePower{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int count=0;
        int temp=num;
        
        while(num!=0){
            count++;
            num/=10;
        }
        num=temp;
        
        while(num>0){
            int ld=num%10;
            int res=1;
            for(int i=1; i<=count; i++){
                res=res*ld;
            }
            System.out.println(res);
            num=num/10;
        }
    }
}