import java.util.Scanner;
class Binary{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("enter a number:");
	int num= sc.nextInt();

	int bin=0;
	int ldigit=0, place=1; 

		while(num>0){
			ldigit=num%2;
			bin=bin+ldigit*place;
			num=num/2;
			place= place*10;
		}
	System.out.println("binary value is:"+bin);
	}
}