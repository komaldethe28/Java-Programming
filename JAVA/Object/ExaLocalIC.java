class ExaLocalIC{
	public static void main(String[] args) {
			System.out.println("main()");
			m1();
	}	
	public static void m1(){
		System.out.println("m1()");
		class LocalInnerClass{
			public void show(){
				System.out.println("Hello from Local Inner Class...");
			}
		}
	LocalInnerClass obj= new LocalInnerClass();
	obj.show();
	}
}