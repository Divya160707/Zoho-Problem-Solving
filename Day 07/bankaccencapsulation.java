class bank{
	private int accno;
	private String name;
	private int balance;

void setaccount(int accno,String name,int balance){
	this.accno=accno;
	this.name=name;
	this.balance=balance;
}
int getaccno(){
	return accno;
}
String getname() {
	return name;
}
int getbalance() {
	return balance;
}
void deposit(int amount) {
	balance=balance+amount;
	System.out.println("Total amount after deposit"+balance);
}
void withdraw(int amount) {
	if(amount<=balance) {
		balance=balance-amount;
		System.out.println("Total amount after withdraw"+balance);
	}
	else {
		System.out.println("inefficient balance");
	}
}
}
class bankaccencapsulation {
	public static void main(String []args) {
		bank b = new bank();
        b.setaccount(12345, "Jamuna", 1000);
        b.deposit(500);
        b.withdraw(300);
        System.out.println("Account No: " + b.getaccno());
        System.out.println("Name: " + b.getname());
        System.out.println("Balance: " + b.getbalance());
	}
}
