import java.util.Scanner; 
class ReverceRec3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int rev = reverseNum(num,0);
		System.out.println(rev);
	}
	public static int reverseNum(int num, int rev){
		return num==0 ? rev :  reverseNum( num/10 , rev*10 + num %10);
	}
}