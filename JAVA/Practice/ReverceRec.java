import java.util.Scanner; 
class ReverceRec{
	static int rev=0;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		reverseNum(num);
		System.out.println(rev);
	}
	public static void reverseNum(int num){
		int rem=num%10;
		rev= rev * 10 +rem;
		num= num/10;
		if(num==0) return;
		reverseNum(num);
	}
}