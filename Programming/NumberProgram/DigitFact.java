import java.util.Scanner;
class DigitFact {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ldigit=0;
        while(num>0){
        	ldigit=num%10;
        	int fact=1;
        	for(int i=1; i<=ldigit; i++){
        		fact*=i;
        	}
        	System.out.println("fact: "+fact);
        	num/=10;
        }

       }
}