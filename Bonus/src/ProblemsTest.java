import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {
    @ParameterizedTest
    @MethodSource
    void convertTemperature(double temperature, double[] expectedResult) {
        double[] result = Problems.convertTemperature(temperature);
        assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> convertTemperature() {
        return Stream.of(
                Arguments.of(36.5, new double[] {309.65000,97.70000}),
                Arguments.of(122.11, new double[] {395.26000,251.79800})
        );
    }

    @ParameterizedTest
    @MethodSource
    void getSneakyNumbers(int[] numbers, int[] expectedResult) {
        int[] results = Problems.getSneakyNumbers(numbers);
        Arrays.sort(results);

        assertArrayEquals(expectedResult, results);
    }

    public static Stream<Arguments> getSneakyNumbers() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 0}, new int[] {0, 1}),
                Arguments.of(new int[]{0, 3, 2, 1, 3, 2}, new int[] {2, 3}),
                Arguments.of(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}, new int[] {4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource
    void missingNumber(int[] numbers, int expectedResult) {
        int result = Problems.missingNumber(numbers);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> missingNumber() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1}, 2),
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource
    void lateFee(int[] daysLate, int expectedResult) {
        int result = Problems.lateFee(daysLate);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> lateFee() {
        return Stream.of(
                Arguments.of(new int[]{5, 1, 7}, 32),
                Arguments.of(new int[]{1, 1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void checkIfPangram(String sentence, boolean expectedResult) {
        boolean result = Problems.checkIfPangram(sentence);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> checkIfPangram() {
        return Stream.of(
                Arguments.of("thequickbrownfoxjumpsoverthelazydog", true),
                Arguments.of("thefoxjumpsoverthedog", false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void isPalindrome(String sentence, boolean expectedResult) {
        boolean result = Problems.isPalindrome(sentence);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> isPalindrome() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true)
        );
    }

    @ParameterizedTest
    @MethodSource
    void countKeyChanges(String input, int expectedResult) {
        int result = Problems.countKeyChanges(input);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> countKeyChanges() {
        return Stream.of(
                Arguments.of("aAbBcC", 2),
                Arguments.of("AaAaAaaA", 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void fizzBuzz(int n, List<String> expectedResult) {
        List<String> result = Problems.fizzBuzz(n);
        assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> fizzBuzz() {
        return Stream.of(
                Arguments.of(3, new ArrayList<String>(Arrays.asList("1", "2", "Fizz"))),
                Arguments.of(4, new ArrayList<String>(Arrays.asList("1", "2", "Fizz", "4"))),
                Arguments.of(5, new ArrayList<String>(Arrays.asList("1", "2", "Fizz", "4", "Buzz"))),
                Arguments.of(15, new ArrayList<String>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")))
        );
    }

    @ParameterizedTest
    @MethodSource
    void recoverOrder(int[] order, int[] friends, int[] expectedResult) {
        int[] result = Problems.recoverOrder(order, friends);
        assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> recoverOrder() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 5, 4}, new int[] {1, 3, 4}, new int[] {3, 1, 4}),
                Arguments.of(new int[]{1, 4, 5, 3, 2}, new int[] {2, 5}, new int[] {5, 2})
        );
    }

    @ParameterizedTest
    @MethodSource
    void twoSum(int[] input, int target, int[] expectedResult) {
        int[] result = Problems.twoSum(input, target);

        assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 5, new int[] {1, 2}),
                Arguments.of(new int[]{1, 3, 7, 9, 20}, 27, new int[] {2, 4})
        );
    }
}