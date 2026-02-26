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
class upcasting {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.sound(); 
    }
}
