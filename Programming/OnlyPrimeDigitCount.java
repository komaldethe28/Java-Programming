import java.util.Scanner;
class OnlyPrimeDigitCount{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("enter a number:");
	int num= sc.nextInt();

	int ld=0;
	int count=0;
	while(num>0){
		ld=num%10;
		if (ld==2 || ld==3 || ld==5 || ld==7){
			System.out.println(ld);
			count++;
		}
		num/=10;
	} 
	System.out.println("The count of prime digit in number is: "+count);
}
}