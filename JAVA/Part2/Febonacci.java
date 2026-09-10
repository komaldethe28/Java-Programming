import java.util.Scanner;
class Febonacci{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print(0+ " " +1 + " ");
		febSer(0,1,n);
	}
public static void febSer(int n1, int n2, int n){
	int n3=n1+n2;
	System.out.print(n3+ " ");
	n--;
	if(n==2) return;
	febSer(n2, n1, n);
	}
}