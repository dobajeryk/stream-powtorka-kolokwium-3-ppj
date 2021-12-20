package teoria;

public class This {
    public static void main(String[] args) {
        new Foo("Hej!");
    }
}

class Foo {

    String text;

    public Foo() {
        System.out.println("Tworze obiekt");
    }

    public Foo(String text) {
        this(); // W tym miejscu wywołujemy inny konstuktor tej klasy (w tym przypadku konstruktor bezargumentowy)
        this.text = text;
        System.out.println(text);
    }
}
