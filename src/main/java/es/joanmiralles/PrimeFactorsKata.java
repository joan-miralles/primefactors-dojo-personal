package es.joanmiralles;

import java.util.HashSet;
import java.util.Set;

class PrimeFactorsKata {

    static Set<Integer> generate(int number) {
        return generateFrom(number, 2, new HashSet<>());
    }

    private static Set<Integer> generateFrom(int number, int cand, Set<Integer> accummulated) {
        if (number == 1) return accummulated;
        while (number % cand == 0) {
            number /= cand;
            if (!accummulated.contains(cand)) accummulated.add(cand);
        }
        return generateFrom(number, cand + 1, accummulated);
    }
}
