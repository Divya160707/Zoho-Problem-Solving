class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}
class runtimepolymorphism {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}
