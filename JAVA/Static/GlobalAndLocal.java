//if we have global and local with same name it will rint local var., so for global var. we have to give className as ref.
class GlobalAndLocal{
	static String str="Global var";				//Global variable
	public static void main(String[] args) {
	 	System.out.println("main()");
	 	m1();
	 } 
	 public static void m1(){
	 	System.out.println("m1() static mathod");
	 	String str= "Local var";				//Local variable
	 	System.out.println("str: "+str);
	 	System.out.println("str: "+GlobalAndLocal.str);

	 }
}