package teoria;

public class Obiekty {
    public static void main(String[] args) {
        Przedmiot ppj = new Przedmiot("PPJ");

        System.out.println(ppj);
        System.out.println(ppj.toString());

        /*
        Dwie powyższe dadzą taki sam efekt!

        Gdy wypisujemy obiekt, java niejawnie wywoluje na tym obiekcie metodę toString().

        Jeżeli nie mamy jawnie zadeklarowanej metody toString() w klasie, której obiekt wypisujemy
        domyślnie zostanie wypisany adres w pamięci, gdzi ten obiekt się znajduje!
         */
    }
}

class Przedmiot {
    String nazwa;

    Przedmiot(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString() {
        return "Nazwa przedmiotu: " + nazwa;
    }

}
