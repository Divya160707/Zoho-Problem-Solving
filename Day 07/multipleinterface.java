interface camera{
	void takephoto();
}
interface musicplayer{
	void playmusic();
}
class smartphone implements camera,musicplayer{
	public void takephoto() {
		System.out.println("Taking photo");
	}
	public void playmusic() {
		System.out.println("Playing music");
	}
}
class multipleinterface{
	public static void main(String []args) {
		smartphone smart=new smartphone();
		smart.takephoto();
		smart.playmusic();
	}
}
