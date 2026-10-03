class NonStaticExa2{
	String str="Non-static variable";
	public static void main(String[] args) {
		new NonStaticExa2().m1();

	}
	public void m1(){
		System.out.println("m1() non- static");
		m2();
		m3();
	}
	public void m2(){
		System.out.println("m2() Non-static");
	}
	public void m3(){
		System.out.println("m3() Non-static");
	}
}