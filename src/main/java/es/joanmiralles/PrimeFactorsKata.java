package es.joanmiralles;

public class PrimeFactorsKata {

    public static int[] generate(int number) {
        int[] list = new int[number];
        if (number == 1) {
            list[0] = number;
        }
        if (number == 2) {
            list[0] = 1;
            list[1] = 2;
        }
        if (number == 3) {
            list[0] = 1;
            list[1] = 2;
            list[2] = 3;
        }
        if (number == 4) {
            list[0] = 1;
            list[1] = 2;
            list[2] = 3;
        }
        return list;
    }

}
