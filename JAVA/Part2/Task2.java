import java.util.*;
class Task2{
	static int marks;
	static double per;
	static String grade;

	static{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a marks");
		phy =sc.nextInt();
		chem =sc.nextInt();
		bio =sc.nextInt();
		math =sc.nextInt();
		lang =sc.nextInt();
	}
	static{
		int add =(phy+chem+bio+math+lang);
		per=add/500.0;
		if () {
			
		}
	}

	static{
		if(per>75){
			System.out.println("A");
		}else if(50<per<75){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}


	public static void main(String[] args) {
		System.out.println("main execued");
	}
}