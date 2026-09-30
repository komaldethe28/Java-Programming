import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		int dup=num;
		Boolean op= isPalindrome(num, 0, dup) ;
		System.out.print( op ? " Palindrome ": " Not Palindrome");
	}
public static boolean isPalindrome(int num, int rev, int dup){
	return num==0? rev==dup :  isPalindrome(num/10, rev*10+num%10, dup);
	}
}