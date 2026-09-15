import java.util.Scanner;
class EvilNum{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("enter a number:");
	int num= sc.nextInt();
		int ldigit=0;
		int count=0;

		while(num>0){
			ldigit=num%2;
			if(ldigit==1){
			count++;
			}
			num/=2;
		}
	if(count%2==0){
			System.out.print("Number is evil number");
	}else{
			System.out.print("Number is not evil number");
		}
	}
}