class person{
	person(){
		System.out.println("Person constructor called");
	}
}
class student extends person{
	student(){
		super();
		System.out.println("Student constructor called");

	}
}
class superconstructor{
	public static void main(String []args) {
		student s=new student();
	}
}
