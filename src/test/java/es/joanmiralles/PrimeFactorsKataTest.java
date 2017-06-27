package es.joanmiralles;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsKataTest {

    @Test
    public void give_int_one_then_return_one() {
        assertThat(PrimeFactorsKata.generate(1), is(new int[]{1}));
    }

    @Test
    public void give_int_two_then_return_one_two() {
        assertThat(PrimeFactorsKata.generate(2), is(new int[]{1, 2}));
    }

    @Test
    public void give_int_three_then_return_one_two_three() {
        assertThat(PrimeFactorsKata.generate(3), is(new int[]{1, 2, 3}));
    }

    @Test
    public void give_int_four_then_return_one_two_three() {
        assertThat(PrimeFactorsKata.generate(4), is(new int[]{1, 2, 3}));
    }

}