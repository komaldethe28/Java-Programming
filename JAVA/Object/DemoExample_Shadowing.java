class DemoExample_Shadowing{
	int a=123;
	static int b= 321;
	public static void main(String[] args) {
		DemoExample_Shadowing obj=new DemoExample_Shadowing();
		obj.m1();
	}
	public void m1(){
		System.out.println("m1 method");
		int a=456;
		int b=654;
		System.out.println(a);         //456
		System.out.println(this.a);    //123
		System.out.println(b);         //654
		System.out.println(DemoExample_Shadowing.b);    //321
		System.out.println(this.b);		//321
	}
}