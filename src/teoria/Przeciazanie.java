package teoria;

public class Przeciazanie {
    public static void main(String[] args) {
        // Pierwsze wywolanie
        byte myByte = 12;
        foo(myByte);

        // Drugie wywolanie
        foo(34234);

        // Trzecie wywolanie
//        foo(12.32d);
    }

    static void foo(int i) {
        System.out.println("Sygnatura metody: foo(int i)");
    }

    static void foo(short s) {
        System.out.println("Sygnatura metody: foo(short s)");
    }

    static void foo(float d) {
        System.out.println("Sygnatura metody: foo(double d)");
    }
}
