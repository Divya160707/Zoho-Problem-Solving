class Animal {
    protected void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void callSound() {
        sound();  // Accessible
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.callSound();
    }
}
