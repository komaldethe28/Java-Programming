class Parent{
	int a=123;
	void m1(){
		System.out.println("m1() from Parent");
	}
}
class Child{
	int b=456;
	void m2(){
		System.out.println("m2() from Child");
	}
}
class DemoSubClass{
	public static void main(String[] args) {
		Child obj=new Child();
		// System.out.println(obj.a);
		System.out.println(obj.b);
		// obj.m1();
		obj.m2();				
	}
}