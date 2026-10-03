class Parent{
	public void m1(){
		System.out.println("m1() from parent method");
	}
} 
class Child extends Parent{
	public void m2(){
		System.out.println("m2() from child");      
		m3();										
		m1();										
		super.m1();		//it will print parent data
	}
	public void m3(){
		System.out.println("m3() from child");		
	}
	public void m1(){
		System.out.println("m1() from child");     
	}
}

class Demo3{
	public static void main(String[] args) {
		new Child().m2();
	}
}
/*
m2() from child
m3() from child
m1() from child
m1() from parent method
*/
