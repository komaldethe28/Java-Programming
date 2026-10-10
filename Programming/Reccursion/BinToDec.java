//binary to decimal
class BinToDec{
	public static void main(String[] args) {
		System.out.println(btd(1010,0,1));
	}
	public static int btd(int num, int dec, int place){
		if(num==0){
			return dec;
		}
		return btd(num/10, dec+num%10*place, place*2);
	}
}

