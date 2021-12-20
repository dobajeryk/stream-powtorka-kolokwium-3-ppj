package teoria;

public class InstrukcjaBlokowa {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18)
            System.out.println("Pelnoletni");
        else
            System.out.println("Niepelnoletni");
            System.out.println("Koniec!");
        /*
            Wcięcia w Javie nie mają znaczenia!
            10 linijka wykona się zawsze! Niezależnie od tego czy kod wejdzie do if czy else.
         */
    }
}
