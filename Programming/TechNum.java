import java.util.Scanner;
class TechNum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int temp=num;
        int count=0;
        
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("Count: "+count);
        int divide=1;

        for(int i=1; i<=count /2; i++){
            divide*=10;
        }
        int firstHalf=temp%divide;
        int secondHalf=temp/divide;
        int sum= firstHalf+secondHalf;
        int squ= sum*sum;

        if(temp==squ){
            System.out.print(temp+ " is Tech Number");
        }else{
            System.out.print(temp+ " is not Tech Number");
        }
    }
}
