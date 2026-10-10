class Pronic{
	public static void main(String[] args){
		boolean res=isPronic(20,1);
		if(res){
			System.out.println("Pronic number");
		}else{
			System.out.println("not pronic number");
		}
	}
	public static boolean isPronic(int num,int i){
		if((i*(i+1)>num)){
			return false;
		}
		if((i*(i+1))==num){
			return true;
		}
		return isPronic(num,i+1);
	}
}