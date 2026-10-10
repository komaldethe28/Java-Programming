class Student{
	String name="Ramesh";
	String email="ramesh12@gmail.com";
	int yop=2026;
	double cgpa=9.5;

	public void displayStudent(){
		System.out.println("...Student Info...");
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("YOP: "+yop);
		System.out.println("CGPA: "+cgpa);
	}
	class Address{
		String location="JM Road";
		String area="Deccan";
		String city="Pune";
		int pincode=411004;

		public void displayAddress(){
			System.out.println("...Address Info...");
			System.out.println("location: "+location);
			System.out.println("area: "+area);
			System.out.println("city: "+city);
			System.out.println("pincode: "+pincode);
		}
	}
}

class DriverStudent{
	public static void main(String[] args) {
		Student student= new Student();
		Student.Address address=student.new Address();
		student.displayStudent();
		address.displayAddress();
	}
}