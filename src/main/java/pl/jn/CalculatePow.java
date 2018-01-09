package pl.jn;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

class CalculatePow {

    private static final int THRESHOLD = 64;

    static List<Double> getNumbersAfterPow(List<Double> numberList) {
        return PowNumbers(numberList).stream().filter(el -> el < THRESHOLD).collect(Collectors.toList());

    }

    private static List<Double> PowNumbers(List<Double> numberList) {
        return ofNullable(numberList).orElseGet(Collections::emptyList).stream().map(el -> Math.pow(el, 2)).collect(Collectors.toList());
    }
}
