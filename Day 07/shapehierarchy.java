class shape{
	void area() {
		System.out.println("Calculate area");
	}
}
class circular extends shape{
	void area() {
		double r=5;
		System.out.println("Area of cicular is: "+3.14*r*r);
	}
}
class rectangle extends shape {
	void area() {
		int l=3;
		int b=2;
		System.out.println("Area of rectangle is: "+l*b);
		}
}
class shapehierarchy{
	public static void main(String [] args) {
		shape s;
		s=new circular();
		s.area();
	    s=new rectangle();
		s.area();
	}
}
