package es.joanmiralles;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsKataTest {
    private static Set<Integer> SET_2_3 = new HashSet<>();
    private static Set<Integer> SET_2_3_7 = new HashSet<>();

    static {
        SET_2_3.add(2);
        SET_2_3.add(3);
        SET_2_3_7.addAll(asList(2, 3, 7));
    }

    @Test
    public void give_int_one_then_return_one() {
        assertThat(PrimeFactorsKata.generate(1), is(emptySet()));
    }

    @Test
    public void give_prime_number_then_return_the_same_number() {
        assertThat(PrimeFactorsKata.generate(2), is(singleton(2)));
        assertThat(PrimeFactorsKata.generate(3), is(singleton(3)));
        assertThat(PrimeFactorsKata.generate(7), is(singleton(7)));
        assertThat(PrimeFactorsKata.generate(13), is(singleton(13)));
    }

    @Test
    public void give_two_factor_number_then_return_two() {
        assertThat(PrimeFactorsKata.generate(8), is(singleton(2)));
        assertThat(PrimeFactorsKata.generate(256), is(singleton(2)));
    }

    @Test
    public void give_int_6_then_return_two_three() {
        assertThat(PrimeFactorsKata.generate(6), is(SET_2_3));
        assertThat(PrimeFactorsKata.generate(12), is(SET_2_3));
        assertThat(PrimeFactorsKata.generate(42), is(SET_2_3_7));
    }

    @Test
    public void test() {
        System.out.println("91 = " + PrimeFactorsKata.generate(91));
    }
}