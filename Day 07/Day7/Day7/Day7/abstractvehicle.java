abstract class vehicle {
	abstract void start();
	void fuel() {
		System.out.println("using fuel");
	}
}
class car extends vehicle{
	void start() {
		System.out.println("Car starting");
	}
}
class bike extends vehicle{
	void start() {
		System.out.println("Bike starting");
	}
}
class abstractvehicle{
	public static void main(String[]args) {
		vehicle v;
		v=new car();
		v.start();
		v.fuel();
		v=new bike();
		v.start();
	}
}
