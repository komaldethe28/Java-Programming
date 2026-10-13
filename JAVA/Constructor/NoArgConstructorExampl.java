class Ticket{
	static int seat=200;
	private String name;
	private String status;
	private String dateTime;
	private String department;
	private String arrival;
	private String seatNumber;
	
	Ticket(){
		this("Guest");
	}
	Ticket(String name){
		super();
		this.name=name;
		this.status="Pending";
		this.dateTime="13/10/26 20:32";
		this.department="Pune Jn";
		this.arrival="Delhi";
		this.seatNumber="SN"+seat++;
	}
	public void displayTicket(){
		System.out.println("\n Ticket Info...\n");
		System.out.println("name: "+name);
		System.out.println("status: "+status);
		System.out.println("Date n Time: "+dateTime);
		System.out.println("department: "+department);
		System.out.println("arrival: "+arrival);
		System.out.println("seat number: "+seatNumber);
	}
	public void setName(String newName){
		this.name=newName;
	}
}

class RailWayYatri{
	public Ticket bookTicket(){
		Ticket ticket = new Ticket();
		return ticket;
	}
}

class NoArgConstructorExampl{
	public static void main(String[] args) {
		RailWayYatri rail=new RailWayYatri();
		Ticket ticket1=rail.bookTicket();
		ticket1.setName("Ramesh Kumar");
		ticket1.displayTicket();

		Ticket ticket2=rail.bookTicket();
		ticket2.displayTicket();
	}
}