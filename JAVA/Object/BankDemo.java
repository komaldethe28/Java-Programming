class Bank{
	private double balance=50000;
	class ATM{
		void checkBalance(){
			System.out.println("Account balance:" +balance);
		}
	}	
}
class BankDemo{
	public static void main(String[] args) {
			Bank.ATM obj= new Bank().new ATM();
			obj.checkBalance();
		}	
}