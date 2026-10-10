class PerfectSquare{
	public static void main(String[] args){
		boolean op=isPerfectSquare(4,1);
		if(op){
			System.out.println("Perfect square");
		}else{
			System.out.println("not perfect square");
		}
	}
	public static boolean isPerfectSquare(int num,int i){
		if(i*i>num){
			return false;
		}
		if((i*i==num)){
			return true;
		}
		return isPerfectSquare(num,i+1);
	}
}