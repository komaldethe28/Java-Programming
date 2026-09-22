//Disarium number
import java.util.Scanner;
class DisariumNum{
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

        int sum=0;
        
        while(num>0){
            int ld=num%10;
            int res=1;
            for(int i=1; i<=count; i++){
                res=res*ld;
            }
        sum=sum+res;
        num/=10;
        count--;
    }
    
        if (sum==temp)
            System.out.println("number is Disarium");
        else
            System.out.println("number is not Disarium");

    }
}