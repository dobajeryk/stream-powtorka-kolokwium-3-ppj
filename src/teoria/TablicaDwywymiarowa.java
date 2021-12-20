package teoria;

class TablicaDwywymiarowa {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9},
        };

        System.out.println(tab.length); // ilosc elementow tablicy, 3
        System.out.println(tab[1].length); // ilosc elementow w "podtablicy", ktora jest pierwszym elementem?
    }
}