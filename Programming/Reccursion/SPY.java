class Spy{
	public static void main(String[] args){
		boolean op=isSpy(123,0,1);
		if(op){
			System.out.println("Spy number");
		}else{
			System.out.println("Not spy number");
		}
	}
	public static boolean isSpy(int num,int sum,int prod){
		if(num==0){
			return sum==prod;
		}
		return isSpy(num/10,sum+num%10,prod*(num%10));
	}
}