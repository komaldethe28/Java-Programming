import java.util.Scanner;
class StrongNum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int dup=num;
        int sum=0;
        int ldigit=0;
        while(num>0){
            ldigit=num%10;
            int fact=1;
            for(int i=1; i<=ldigit; i++){
                fact*=i;
            }
            System.out.println("fact: "+fact);
            sum+=fact;
            num/=10;
        }
        if(sum==dup){
                System.out.println(dup+" is a Strong number");
            }
        else {
            System.out.println(dup+ " not a Strong number");
        }
       }
}