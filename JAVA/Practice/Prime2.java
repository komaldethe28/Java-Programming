import java.util.Scanner; 
class Prime2{
public static void main(String [] args ){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number:");
	int num= sc.nextInt();
	Boolean op= isPrime(num, 2);
	System.out.print(op?num+" is Prime": num+" is not Prime");
	}
public static boolean isPrime(int num, int i){
	if(num<2) return false;
	for (i=2;i<=num/2;i++){
			if (num%i==0) return false;		
		}
		return true;
	}
}