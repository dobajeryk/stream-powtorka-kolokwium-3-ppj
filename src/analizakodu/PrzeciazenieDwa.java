package analizakodu;

public class PrzeciazenieDwa {

    public static void fun(String str, short s) {
        System.out.println("P" + str + s);
    }

    public static void fun(String str, int i) {
        System.out.println("A" + str + i);
    }

    public static void fun(String str, long l) {
        System.out.println("J" + str + l);
    }

    public static void main(String[] args) {
        int i = 0;
        do {
            switch (i % 3) {
                case 0:
                    fun("--", (byte)21L);
                    break;
                case 1:
                    fun("--", 'e');
                    /*
                    A
                    a - 90, b - 91, c - 92, d -93, e - 94
                    0
                     */
                    break;
                case 2:
                    fun("--", 37l);
                    break;
            }
            i+= 5;
        } while (i < 15);
    }
}
