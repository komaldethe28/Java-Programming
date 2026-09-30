import java.util.*;
class Dish{
	static int id=123123;
	String name;
	String type;
	double price;
	String dishId;

	Dish(String name, String type, double price, String dishId){
		this.name= name;
		this.type= type;
		this.price=price;
		this. dishId= "DID "+id++; 		
	}	
	public void displayDish(){
		System.out.println("\n ------Dish Info------");
		System.out.println("Id: "+dishId);
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}
}

class DatabaseConection{
	static String portNum="3306";
	static String dbName= "restorant_db";
	static String un= "scott";
	static String pass= "tiger";

	public static boolean getConnection(String un, String pass){
		if (un.equals(DatabaseConection.un) && pass.equals(DatabaseConection.pass))
			return true;
		return false;
	}
}

class Restorant{
	static final string databaseName;
	static String potNumber;
	static String dbUn;
	static String dbPass;
	static String localHost;

	static ArrayList<Dish> dishes= addDishes();
	static ArrayList<Dish> cart= new ArrayList<Dish>();
	static double totalBill;

	static{
		databaseName =System.getenv("database");
		portNum =System.getenv("portNum");
		dbUn =System.getenv("un");
		dbPass =System.getenv("password");
	}

	static{
		String url="jdbc:mysql://localhost:"+portNum+"/"+databaseName;
		if(DatabaseConection.getConnection(dbUn,dbPass)){
			launchApplication();
		}else{
			System.out.println("Server problem.....");
			System.exit(0);
		}
	}
	public static ArrayList<Dish> addDishes(){
		ArrayList<Dish> dishes= new ArrayList<Dish>();
		dishes.add(new Dish("pilao","VEG",200));
		dishes.add(new Dish("roti","VEG",40));
		dishes.add(new Dish("pain rice","VEG",150));
		dishes.add(new Dish("panner","VEG",350));
		dishes.add(new Dish("biryani","VEG",450));
		return dishes;
	}
	public static void launchApplication(){
		while(true){
			System.out.println("\n ***Welcome ***");
			System.out.println("\n ***Java Ka Dhaba ***");

			System.out.println("1. ViewMenu \n2.Cart \n3.Order \n4.Logout");
			System.out.println("Enter an option: ");
			int option=new Scanner (System.in).nextInt();

			switch(option){
			case 1 -> viewMenu();
			case 2 -> cart();
			case 3 -> order();
			case 4 -> logout();
			default -> System.out.println("\n Invalid input");
			}
		}
	}

public static void order(){
	System.out.println("IMP soon");
}
public static void logout(){
	System.out.println("Thank you and visit again");
	System.exit(0);
}
public static void cart(){
	if(cart.size()==0){
		System.out.println("\n Cart is empty\n");
		return;
	}
	System.out.println("tem in cart: ");
	for(Dish ele: cart){
		ele.displayDish();
	}
	System.out.println("Total bill: "+ totalBill);
	
}
public static void viewMenu(){
	while(true){
		System.out.println("\n *** All Mennu ***");
		System.out.println(dishes.size());
		for(Dish ele: dishes){
			ele.displayDish();
		}
		System.out.println("enter a dishId: ");

	}
}
}



class DriverEampleRestrorant{
	public static void main(String[] args) {
		new Restorant();
	}
}