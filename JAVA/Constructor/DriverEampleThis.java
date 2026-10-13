class Suresh{
	Suresh(){
		this(123);
		System.out.println("No-Argument Parent");
	}
	Suresh(int a){
		System.out.println("Parameter Parent");
	}
}
class Ramesh extends Suresh{
	Ramesh(){
		this(10);
		System.out.println("No-Arguments Child");
	}
	Ramesh(int a){
		System.out.println("Parameter Child");
	}
}
class DriverEampleThis{
	public static void main(String[] args) {
		Ramesh obj=new Ramesh();
	}
}

/* OUTPUT ->
Parameter Parent
No-Arguments Child
No-Argument Parent
Parameter Child
*/