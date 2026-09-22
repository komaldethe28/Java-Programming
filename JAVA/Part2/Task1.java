import java.util.*;
class Task1{
	static int num;
	static int reverseNumber;

	static{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
	}
	static{
		while(num>0){
			int ld=num%10;
			reverseNumber=reverseNumber*10+ld;
			num/=10;
			
		}
		System.out.println(reverseNumber);
	}

	public static void main(String[] args) {
			System.out.println("main()");
			
		}	
}