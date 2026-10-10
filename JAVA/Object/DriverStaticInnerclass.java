class OuterClass{
	static class InnerClass{
		static int a=123;
		public  static void m1(){
			System.out.println("hello from static InnerClass...");
		}
	}
}
class DriverStaticInnerclass {
    public static void main(String[] args) {
        OuterClass.InnerClass.m1();
        System.out.println(OuterClass.InnerClass.a);
    }
}