import java.util.Scanner; 
class Prime{
public static void main(String [] args ){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number:");
	int num= sc.nextInt();
	Boolean op= isPrime(num);
	System.out.print(op?num+" is Prime": num+" is not Prime");
	}
public static boolean isPrime(int num, int i){
	if(num%i==0 && num!=2 || num<2) return false;
	if (i>num/2) return true;
	return isPrime(num, ++i);
	}
}