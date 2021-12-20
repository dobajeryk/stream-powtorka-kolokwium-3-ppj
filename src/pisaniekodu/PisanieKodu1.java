package pisaniekodu;

public class PisanieKodu1 {
    public static void main(String[] args) {
        Zwierzak kot = new Zwierzak("Mlody", 5);
        kot.setWaga(10);
        kot.incWiek();
        kot.show();
    }
}

class Zwierzak {
    private String nazwa;
    private double waga;
    private int wiek;

    public Zwierzak(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void incWiek() {
        this.wiek++;
//        Alternatywnie można użyc
//        this.wiek += 1;
//        this.wiek = this.wiek + 1;
    }

    public void show() {
        System.out.println(
                "Nazwa: " + nazwa + "\n" +
                        "Wiek: " + wiek + "\n" +
                        "Waga: " + waga + "\n"
        );
    }

}