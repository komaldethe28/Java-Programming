import java.util.Scanner;
class SumPrime{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number:");
		int num= sc.nextInt();

		int ldigit=0, sum=0;
		while(num>0){
			ldigit=num%10;
			if(ldigit==2 || ldigit==3 || ldigit==5 || ldigit==7){
				System.out.println(ldigit+ " ");
				sum+=ldigit;
			}
			num/=10;
		}
		System.out.print("Sum is: "+sum);
	}
}