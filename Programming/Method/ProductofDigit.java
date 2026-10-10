import java.util.Scanner;
class ProductofDigit{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int res = DigitProduct(num);
		System.out.println(res);
	}
	public static int DigitProduct(int num){
		int prod=1;
		int ld=0;
		while(num>0){
			ld=num%10;
			prod*=ld;
			num/=10;
		}
		return prod;
	}
}