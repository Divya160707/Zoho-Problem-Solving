class Math {
    void add(int a, int b) {
        System.out.println("Sum of 2 ints: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 ints: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }
}
class methodoverloading {
    public static void main(String[] args) {
        Math m = new Math();
        m.add(10,20);
        m.add(10,20,30);
        m.add(5,2);
    }
}
