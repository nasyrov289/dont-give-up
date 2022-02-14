package com.company.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DerivativesTest {

    @ParameterizedTest(name="Derivatives.differentiate(\"{0}\")")
    @ValueSource(strings = {"0", "1", "-1", "42", "-13"})
    void testConstant(String input) {
        assertEquals("0", Derivatives.differentiate(input), String.format("Incorrect answer for \"%s\"", input));
    }

    @ParameterizedTest(name="Derivatives.differentiate(\"{0}\")")
    @CsvSource({"12x^3,36x^2", "-12x^3,-36x^2", "12x^-3,-36x^-4", "-12x^-3,36x^-4"})
    void testRegularCases(String input, String expected) {
        assertEquals(expected, Derivatives.differentiate(input), String.format("Incorrect answer for \"%s\"", input));
    }

    @ParameterizedTest(name="Derivatives.differentiate(\"{0}\")")
    @CsvSource({"7x,7", "-7x,-7", "12x,12", "-12x,-12"})
    void testDegree1(String input, String expected) {
        assertEquals(expected, Derivatives.differentiate(input), String.format("Incorrect answer for \"%s\"", input));
    }

    @ParameterizedTest(name="Derivatives.differentiate(\"{0}\")")
    @CsvSource({"7x^2,14x", "-7x^2,-14x"})
    void testDegree2(String input, String expected) {
        assertEquals(expected, Derivatives.differentiate(input), String.format("Incorrect answer for \"%s\"", input));
    }

    @ParameterizedTest(name="Derivatives.differentiate(\"{0}\")")
    @CsvSource({"x,1", "-x,-1", "x^4,4x^3", "-x^4,-4x^3", "x^-4,-4x^-5", "-x^-4,4x^-5"})
    void testNoCoefficient(String input, String expected) {
        assertEquals(expected, Derivatives.differentiate(input), String.format("Incorrect answer for \"%s\"", input));
    }
}