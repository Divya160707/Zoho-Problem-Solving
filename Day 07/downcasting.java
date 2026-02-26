class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class downcasting {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        Dog d = (Dog) a;
        d.sound();
        d.bark();
    }
}
