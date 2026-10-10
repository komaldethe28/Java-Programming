import java.util.Scanner;
class CountOf0s{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("enter a number:");
	int num= sc.nextInt();
		int ldigit=0;
		int count=0;

		while(num>0){
			ldigit=num%2;
			if(ldigit==0){
			count++;
			}
			num/=2;
		}
System.out.println("Count="+ count);
	}
}