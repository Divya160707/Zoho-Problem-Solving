class student{
	private int id;
	private String name;
	private int marks;
	void setid(int id) {
		this.id=id;
	}
	void setname(String name) {
		this.name=name;
	}
	void setmarks(int marks) {
		this.marks=marks;
	}
	int getid() {
		return id;
	}
	String getname() {
		return name;
	}
	int getmarks() {
		return marks;
	}
}
class stugetset {
	public static void main(String []args) {
		student s=new student();
		s.setid(9);
		s.setname("Jamuna");
		s.setmarks(99);
		System.out.println("ID:"+s.getid());
		System.out.println("Name:"+s.getname());
		System.out.println("marks:"+s.getmarks());
	}
}
