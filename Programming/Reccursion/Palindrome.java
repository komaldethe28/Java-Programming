class Palindrome{
	public static void main(String[] args){
		boolean op=isPalindrome(121,121,0);
		if(op){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
	}
	public static boolean isPalindrome(int num,int temp,int rev){
		if(num==0){
			return temp==rev;
		}
		return isPalindrome(num/10,temp,rev*10+num%10);
	}
}