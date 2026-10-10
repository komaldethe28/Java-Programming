class Employee{
	String ename="Ramesh";
	String empId="123123";
	class Profile{
		public void displayEmpInfo(){
			System.out.println("...Emp info...");
			System.out.println("Name: " +ename);
			System.out.println("Employee Id: "+empId);
		}
	}
}

class AccessInnerclass{
	public static void main(String[] args) {
			new Employee().new Profile().displayEmpInfo();
		}	
}