class employee{
	void salary() {
		System.out.println("Basic alary of employee");
	}
}
class manager extends employee{
	void salary() {
		System.out.println("Manager salary is 50000");
	}
}
class overridesalary{
	public static void main(String [] args) {
		employee e=new manager();
		e.salary();
	}
}
