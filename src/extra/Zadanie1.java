package extra;

public class Zadanie1 {
    public static void main(String[] args) {
        CiagnikSiodlowu brazowy = new CiagnikSiodlowu("brazowy", 2, 20);
        brazowy.rozpocznijJazde();
    }
}

class Pojazd {
    private String color;

    public Pojazd(String color) {
        this.color = color;
    }
}
class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }
}
class CiagnikSiodlowu extends PojazdKolowy {
    private double masa;

    public CiagnikSiodlowu(String color, int iloscOsi, double masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public void rozpocznijJazde() {
        if (masa / getIloscOsi() > 11) {
            System.out.println("Jazda niebezpieczna, odmowa uruchmienia silnika");
        } else {
            System.out.println("Uruchomiono silnik");
        }
    }
}