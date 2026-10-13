import java.util.*;

class Mock{
	String subj;
	String rating;
	Mock(String sub,String rating){
		this.subj=sub;
		this.rating=rating;
	}

	public void displayMock(){
		System.out.println("Subject: "+subj+" Rating: "+rating);
	}
}

class Student{
	static int id=23423;
	String studentId;
	String name;
	Long contact;
	int yop;
	double cgpa;
	ArrayList<Mock> mockList=new ArrayList<Mock>();

	Student(String name,Long contact,int yop,double cgpa){
		this.name=name;
		this.contact=contact;
		this.yop=yop;
		this.cgpa=cgpa;
		this.studentId="SID"+id++;
	}

	public void displayStudent(){
		System.out.println("\n Student info\n");
		System.out.println("Student id: "+studentId);
		System.out.println("name: "+name);
		System.out.println("contact: "+contact);
		System.out.println("yop: "+yop);
		System.out.println("cgpa: "+cgpa);

		if(mockList.size()==0){
			System.out.println("No mock given");
		}
		else{
			System.out.println("Mock data");

			for(Mock mock:mockList){
				mock.displayMock();
			}
		}
	}
	public void addMock(Mock mock){
		mockList.add(mock);
	}
}

class StudentManag{
	ArrayList<Student> studentList=new ArrayList<>();
	public void launchApp(){
		while(true){
			System.out.println("\n WELCOME\n");
			System.out.println("1.Add student");
			System.out.println("2.View all students");
			System.out.println("3.Remove students");
			System.out.println("4.Logout");

			System.out.println("Enter an option");

			int opt=new Scanner(System.in).nextInt();
			switch(opt){
				case 1-> addStudent();
				case 2-> viewAllStudents();
				case 4-> logout();
			}
		}
	}

	public void viewAllStudents(){
		if(studentList.size()==0){
			System.out.println("\n NO DATA FOUND\n");
			return;
		}

		for(Student ele:studentList){
			ele.displayStudent();
		}

		System.out.println("\n Do u want to update mock rating: ");
		String res=new Scanner(System.in).next().toUpperCase();
		if(res.equals("YES")){
			System.out.print("Enter student id:");
			String sid=new Scanner(System.in).next().toUpperCase();
			for(Student ele : studentList){
				if(ele.studentId.equals(sid)){
					System.out.println("\nEnter subj");
					String subj=new Scanner(System.in).nextLine().toUpperCase();
					System.out.println("rating: ");
					String rating=new Scanner(System.in).nextLine();
					ele.addMock(new Mock(subj,rating));
					return;
				}
			}
			System.out.println("\n STUDENT ID NOT FOUND\n");
		}
	}

	public void logout(){
		System.out.println("\n THANK U \n");
		System.exit(0);
	}

	public void addStudent(){
		System.out.println("\n ADD STUDENT MODULE\n");
		System.out.print("name : ");
		String name=new Scanner(System.in).nextLine();
		System.out.print("Contact : ");
		Long contact=new Scanner(System.in).nextLong();
		System.out.print("YOP : ");
		int yop=new Scanner(System.in).nextInt();
		System.out.print("CGPA : ");
		double cgpa=new Scanner(System.in).nextDouble();
		studentList.add(new Student(name,contact,yop,cgpa));
	}
}

class DriverExampleParamCon{
	public static void main(String[] args){
		new StudentManag().launchApp();

	}
}