package extra;

public class Zadanie2 {
    public static void main(String[] args) {
        Osoba michal = new Osoba("Michal");
        System.out.println(michal.wyswietl());

        Spawacz michal1 = new Spawacz("Michal", 20);
        System.out.println(michal1.wyswietl());
    }
}

class Osoba {
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String wyswietl() {
        return imie;
    }
}

class Spawacz extends Osoba {
    private int stazPracy;

    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }

    public String wyswietl() {
        return super.wyswietl() + " " + stazPracy;
    }
}



