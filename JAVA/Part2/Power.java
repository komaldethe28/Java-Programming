import java.util.Scanner;
class Power{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num= sc.nextDouble();
		System.out.print("Enter a power : ");
		double pow= sc.nextDouble();
		double op=findPower(num , pow, 1);
		System.out.println(num+" ^ "+pow+" is " +op);

}
public static double findPower(double num , double pow, double op){
	op=op*num;
	if(--pow==0) return op;
	return findPower(num , pow, op);
	}
}