import java.util.Scanner;
class FactorialOfPrimeDigit {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();    


        while(num>0){
            int ld=0;
            ld=num%10;
            
            int factorial=1;
            if(ld==2 || ld==3 || ld==5 || ld==7){
                for(int i=1; i<=ld;i++)
                    factorial*=i;
            }
            System.out.println("factorial: "+ factorial);
            num/=10;
        }

    }
}