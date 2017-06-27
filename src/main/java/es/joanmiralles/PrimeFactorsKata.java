package es.joanmiralles;

public class PrimeFactorsKata {

    public static int[] generate(int number) {
        int[] list = new int[number];
        if (number == 1) {
            list[0] = 1;
        }
        if (number == 2) {
            list[0] = 1;
            list[1] = 2;
        }
        return list;
    }
}
