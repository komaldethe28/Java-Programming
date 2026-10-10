//decimal to binary
class DecToBin{
	public static void main(String[] args) {
		System.out.println(dtb(10,0,1));
	}
	public static int dtb(int num, int bin, int place){
		if(num==0){
			return bin;
		}
		// 1st way

		/*
		int ld=num%2;
		bin=bin+ld*place;
		num=num/2;
		place*=10;
		return dtb(num , bin, place);
		*/
		
		// 1st way
		return dtb(num/2, bin+num%2*place, place*10);
	}
}