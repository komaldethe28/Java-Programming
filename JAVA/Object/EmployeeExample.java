class Employee{
	String name;
	String department;
	int id;
	double salary;
	String role;
	byte experience;

	public void displayEmployeeInfo(){
		System.out.println("\n Employee Info...");
		System.out.println("Name: " +name);
		System.out.println("Department: "+department);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
		System.out.println("Role: "+role);
		System.out.println("Experience: "+experience);

	}
}

class EmployeeExample{
	public static void main(String[] args) {
			Employee emp= new Employee();
			System.out.println(emp);

			emp.displayEmployeeInfo();
			emp.name="Samiksha";
			emp.department="Software dev";
			emp.id=1234;
			emp.salary=500000;
			emp.role="Developer";
			emp.experience=1;

			System.out.println(".....................");
			emp.displayEmployeeInfo();

		}	
}