import java.util.Scanner;
class FirstnonPrimeDigit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int ld=0;
        while(num!=0){
        	ld=num%10;
        	if(ld !=2 && ld!=3 && ld!=5 && ld!=7){
        		System.out.println("Print first non prime digit: "+ld);
        		break;
        	}
        	num/=10;
        }
    }
}
