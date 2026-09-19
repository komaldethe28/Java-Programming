import java.util.Scanner;
class Task{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a choice:");
        int choice= sc.nextInt();
        
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        switch(choice){
        case 1: prime(num);
            break;
        case 2: armstrongNum(num);
            break;
        case 3: strong(num);
            break;
        case 4: spy(num);
            break;
        default:
            System.out.print("Invalid input!!");
        }
    }

    public static void prime(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if (count == 2) {
            System.out.print("The number is prime");
            } else {
                System.out.print("The number is not prime");
            }
    }


    public static void strong(int num){
        int dup=num;
        int sum=0;
        int ldigit=0;
        while(num>0){
            ldigit=num%10;
            int fact=1;
            for(int i=1; i<=ldigit; i++){
                fact*=i;
            }
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

    public static void spy(int num){
        int sum=0;
        int product=1;
        int lastDigit=0;

        while(num!=0){
            lastDigit=num%10;
            sum=sum+lastDigit;
            product=product*lastDigit;
            num=num/10;
        }
        if(sum==product){
            System.out.println("Spy Number.");
        }else{
             System.out.println("Not a Spy Number.");
        }
    }

    public static void armstrongNum(int num){
        int count=0;
        int temp=num;
        
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
            System.out.println(res);
            num=num/10;
        }
        System.out.println(sum);
        if(sum==temp) 
            System.out.println("number is ArmstrongNum");
        else
            System.out.println("number is not ArmstrongNum");
    
    }


}

