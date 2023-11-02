package hw_3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTest {

    NumberChecker numCheck;
    @BeforeEach
    void testInit() {
        numCheck = new NumberChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 0, 4, 256})
    void testEvenNumber(int i) {
        assertTrue(numCheck.evenOddNumber(i));
    }
    @ParameterizedTest
    @ValueSource(ints = {-5, 1, 333, 9999})
    void testOddNumber(int i) {
        assertFalse(numCheck.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 50, 94, 100})
    void testNumberInInterval(int i) {
        assertTrue(numCheck.numberInInterval(i));
    }
    @ParameterizedTest
    @ValueSource(ints = {-20, 0, 24, 101})
    void testNumberNotInInterval(int i) {
        assertFalse(numCheck.numberInInterval(i));
    }
}