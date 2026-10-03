class NonStaticExa3{
	public static void main(String[] args) {
		System.out.println("main()");
		new NonStaticExa3().m1();
	}
	public void m1(){
		System.out.println("m1() non-static outer class..");
		InnerClass obj= new InnerClass();
		System.out.println(obj.str);
		obj.m2();
	}
	class InnerClass{
		String str="non-static InnerClass variable";
		public void m2(){
			System.out.println("non-static m2() InnerClass");
		}
	}
}