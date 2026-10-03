class NonStaticExa5{
	public static void main(String[] args) {
			new NonStaticExa5().m1();
		}	
		public void m1(){
			System.out.println("m1 non-static");
			Demo1 obj = new Demo1();
			System.out.println(obj.str1);
			obj.m2();
			Demo1.InnerClass obj2=new Demo1().new InnerClass();
			// Demo1.InnerClass obj2=obj.new InnerClass();     //its a second way
			System.out.println(obj2.str2);
			obj2.m3();
		}
}
class Demo1{
	String str1="Non-static variable";
	public void m2(){
		System.out.println("m2() non-static method()");
	}
	class InnerClass{
		String str2="Non-static var InerClass";
		public void m3(){
			System.out.println("m2() non- static method() InnerClass");
		} 
	}
}
