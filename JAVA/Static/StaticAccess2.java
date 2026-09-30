//accsessing static method from one class to another for that we have to give className as a ref.
class StaticAccess2{
	public static void main(String[] args) {
		System.out.println("main()");
		Demo obj=new Demo();
		obj.m2();
		Demo.InnerClass obj1=obj.new InnerClass();
		obj1.m3();
	}
	public static void m1(){
		System.out.println("m1() static from StaticAccess2");
	}
}

class Demo{
	{
		System.out.println("non-static block Demo");
		StaticAccess2.m1();
	}
	public void m2(){
		System.out.println("m2() non-static from Demo");
		StaticAccess2.m1();
	}
	class InnerClass{
		public void m3(){
			System.out.println("m3() non-static from InnerClass of Demo");
			StaticAccess2.m1();
		}
	}
}

/*   OUTPUT=
main()
non-static block Demo
m1() static from StaticAccess2
m2() non-static from Demo
m1() static from StaticAccess2
m3() non-static from InnerClass of Demo
m1() static from StaticAccess2 
*/
