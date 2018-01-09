package pl.jn;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static pl.jn.CalculatePow.getNumbersAfterPow;


public class CalculatePowTest {
    private List<Double> numberList;
    private List<Double> expectedNumberList;
    private List<Double> expectedNumberList2;

    @Before
    public void setup() {
        numberList = asList(2.0, 4.0, 6.0, 7.0, 9.0);
        expectedNumberList = asList(4.0, 16.0, 36.0, 49.0);
        expectedNumberList2 = asList(4.0, 16.0, 36.0, 81.0);
    }

    @Test
    public void should_return_false_if_null() {
        assertThat(getNumbersAfterPow(null)).hasSize(0);
    }

    @Test
    public void should_return_true_lt_64() {
        assertThat(getNumbersAfterPow(numberList)).isEqualTo(expectedNumberList);
    }

    @Test
    public void should_return_false_lt_64() {
        assertThat(getNumbersAfterPow(numberList)).isNotEqualTo(expectedNumberList2);
    }

}