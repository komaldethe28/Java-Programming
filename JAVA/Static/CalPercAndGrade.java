//Calculate Percentage and Grade using static 
import java.util.Scanner;
class CalPercAndGrade{

	static int marks;
	static double percentage;
	static String grade;

	static{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks :");
		marks=sc.nextInt();
	} 
	static{
		percentage=marks/500.0*100;
	}
	static{
		if(percentage>=90)
			grade="A";
		if(percentage>=70)
			grade="B";
		else
			grade="C";
	}

	public static void main(String[] args) {
		System.out.println("Marks:" +marks);
		System.out.println("Percentage:" +percentage);
		System.out.println("Grade:" +grade);
	}
}