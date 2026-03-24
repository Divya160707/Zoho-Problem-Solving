class GenericClass<T> {
    T value;

    GenericClass(T value) {
        this.value = value;
    }

    void print() {
        System.out.println(value);
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(10);
        GenericClass<String> obj2 = new GenericClass<>("Hello");

        obj1.print();
        obj2.print();
    }
}
