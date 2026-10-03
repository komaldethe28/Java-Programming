class Parent{
	public void m1(){
		System.out.println("m1 () from parent class");
	}
	public void m2(){
		System.out.println("m2 () from parent class");
	}
}
class Child extends Parent{
	public void m3(){
		System.out.println("m3 () from child class");
	}
}
class DemoExample_Inheritance{
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println("main ()");
		obj.m3();
		obj.m1();
		obj.m2();
	}
}