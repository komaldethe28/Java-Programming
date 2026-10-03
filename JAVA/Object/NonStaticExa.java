class NonStaticExa{
	static String str="static variable";
	public static void main(String[] args) {
		System.out.println("main() start");
		NonStaticExa obj = new NonStaticExa();
		obj.m1(); 
	}
	public void m1(){
		System.out.println("m1 from non static...");
		System.out.println(str);
		m2();
		System.out.println(InnerClass.str2);
		InnerClass.m3();
	}
	public static void m2(){
		System.out.println("m2 static..");
	}
	static class InnerClass{
		static String str2="static var from InnerClass";
		public static void m3(){
			System.out.println("m3 static method fron InnerClass..");
		}
	}
}
