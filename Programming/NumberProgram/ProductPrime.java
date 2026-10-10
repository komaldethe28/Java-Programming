import java.util.Scanner;
class ProductPrime{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number:");
		int num= sc.nextInt();

		int ldigit=0, pro=1;
		while(num>0){
			ldigit=num%10;
			if(ldigit==2 || ldigit==3 || ldigit==5 || ldigit==7){
				System.out.println(ldigit);
				pro*=ldigit;
			}
			num/=10;
		}
		System.out.print("Product is: "+pro);
	}
}