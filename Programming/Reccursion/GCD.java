class GCD{
	public static void main(String[] args) {
		int num1=12, num2=18;
		int small=num2>num1? num1:num1;
		gcd(num1,num2,1,small);

	}
	public static boolean gcd(int num1, int num2,int i, int small){
		if(i<small){
			return false;
		}
		int gcd=0;
		if(num1%i==0 && num2%i==0){
			gcd=i;
		}
		System.out.println(gcd);
		return gcd(num1, num2, i+1,small);
	}
}