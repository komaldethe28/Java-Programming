class NonStaticExa4{
	public static void main(String[] args) {
		new NonStaticExa4().m1();
	}
	public void m1(){
		System.out.println("m1() non-static");
		Demo1 obj = new Demo1();
		System.out.println(obj.str);
		obj.m2();
	}
}
class Demo1{
	String str="non- static var outer class";
	public void m2(){
		System.out.println("m2() non- static method outer class");
	}
}