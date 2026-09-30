import java.util.Scanner;
class Demo12{
	Scanner sc= new Scanner(System.in);
	int num=153;
	int pow=countOfDigits(num,0);
	int sum = findSum(num,pow,0);
	System.out.println( sum==num? num+ " is Armstrong" :num+ " is not Armstrong"  );
}

public static int findSum(int num, int pow, int sum){
	if(num==0) return sum;
	int dgt= num%10;
	int pow1= findPower(dgt,pow,1);
	return findSum(num/10,pow,sum+pow1);
}

public static int findPower(int dgt, int pow, int op){
	if(pow==0) return op;
	op=op*dgt;
	 return findPower(dgt, --pow, op);
}

public static int counOfDigit(int num, int cnt ) {
	if (num==0) retrn cnt;
	cnt++;
	return counOfDigit(num/10,cn);
}

public static int findSum(int num, int pow, int sum){
	
}












