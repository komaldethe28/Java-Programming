class HarshadNumber{
	public static void main(String[] args){
		int num=81;
		boolean op=isHarshad(num,num,0);
		if(op){
			System.out.println("Harshad number");
		}
		else{
			System.out.println("Not harshad number");
		}
	}
	public static boolean isHarshad(int num,int temp,int sum){
		if(num==0){
			return temp%sum==0;
		}
		return isHarshad(num/10,temp,sum+num%10);
	}
}