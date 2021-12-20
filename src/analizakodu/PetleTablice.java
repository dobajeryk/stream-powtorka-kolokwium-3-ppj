package analizakodu;

public class PetleTablice {
    public static void main(String[] args) {

        int[][] myTab = new int[4][];
        /*
        Tak wygląda tablica po jej inicjalizacji
        myTab = {
        null,
        null,
        null,
        null,
        };
         */

        int size = (int) Math.random();
        // Math.random() -> zwraca zawsze wartosci z zakres <0, 1) -> co rzutowane na int da nam zawsze 0!

        for (int i = 0; i < myTab.length; i++)
            myTab[i] = new int[size + 1];

        /*
        Tak wygląda tablica po wykonaniu powyższej pętli
        myTab = {
        {0},
        {0},
        {0},
        {0},
        };
         */

        for (int i = 0; i < myTab.length; i++)
            if (!(i % 2 == 0))
                System.out.print("??");
            else
                System.out.print(myTab[i/2 + 1]); // myTab[0] -> {0} -> @adres

        System.out.println(myTab[0][0]); // 0
        System.out.println(myTab[0]); // {0} - cała tablica -> @Adres
    }
}