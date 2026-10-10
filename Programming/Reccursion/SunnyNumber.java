class SunnyNumber{
	public static void main(String[] args){
		int num=80;
		num=num+1;
		boolean res=isSunny(num,1);
		if(res){
			System.out.println("Sunny number");
		}else{
			System.out.println("Not sunny number");
		}
	}
	public static boolean isSunny(int num,int i){
		if(i*i>num){
			return false;
		}
		if(i*i==num){
			return true;
		}
		return isSunny(num,i+1);
	}
}