package analizakodu;

public class Przeciazenie {
    public static void main(String[] args) {
        System.out.print(foo(5f));
    }

    public static Bar foo(byte value) {
        return new Bar((int)(value-2));
    }
        
    public static Bar foo(double value) {
        return new Bar(value+1);
    }

    public static Bar foo(int value) {
        return new Bar(value);
    }

    public static Bar foo(short value) {
        return new Bar(value-1);
    }
}

class Bar {
    double value;

    public Bar() {
        System.out.println("!!!");
    }

    public Bar(int value) {
        System.out.print("A");
        this.value = value;
    }

    public Bar(double value) {
        this();
        System.out.print("B");
        this.value = value;
    }

    @Override
    public String toString() {
        return value+"Z";
    }
}
