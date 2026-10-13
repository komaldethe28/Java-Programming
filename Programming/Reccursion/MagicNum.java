import java.util.Scanner;
class MagicNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();

		System.out.println(isMagic(num));
		
	}
	public static int sumOfDigit(int num){
		if(num==0){
			return 0;
		}
		return num%10+sumOfDigit(num/10);
	}
	public static boolean isMagic(int num){
		if(num<=9){
			return num==1;
		}
		return isMagic(sumOfDigit(num));
	}

	
}