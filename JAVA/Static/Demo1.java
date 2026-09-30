public final class Demo1{
	public static void main(String[] args) {
		System.out.println("Main starts");
		m1(10,20);
		System.out.println("main ends");
	}
	public static void m1(int a, int b){
		System.out.println("m1() method");
		try{
			System.out.println(a+b);
			int op=m2();
		}catch(Exception e){
			System.out.println("catch");
		}
	}
	public static strictfp int m2(){
		System.out.println("m2() method");
		return 123;
	}
}