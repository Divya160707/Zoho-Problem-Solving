class engine{
	void start() {
		System.out.println("Engine starting");
	}
}
class car{
	engine e=new engine();
	void drive() {
		e.start();
		System.out.println("Car is moving");
	}
}
class hasmethod {
    public static void main(String[] args) {
       car c=new car();
       c.drive();
}
}
