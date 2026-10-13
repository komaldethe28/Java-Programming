class Suresh{
	Suresh(){
		System.out.println("No-Argument Parent");
	}
	Suresh(int a){
		System.out.println("Parameter Parent");
	}
}
class Ramesh extends Suresh{
	Ramesh(){
		super(10);
		System.out.println("No-Arguments Child");
	}
	Ramesh(int a){
		System.out.println("Parameter Child");
	}
}
class DriverEampleSuper{
	public static void main(String[] args) {
		Ramesh obj1=new Ramesh();
		Ramesh obj2=new Ramesh(10);
	}
}

/* OUTPUT ->
Parameter Parent
No-Arguments Child
No-Argument Parent
Parameter Child
*/