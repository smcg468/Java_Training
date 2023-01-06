package Challenges.GreenNumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GreenNumberTest {

    @ParameterizedTest
    @MethodSource("Green")
    void returnCorrectGreenNumber (int N, long answer){

        long greenNum = GreenNumber.Green(N);

        assertEquals(answer, greenNum);

    }

    private static Stream<Arguments> Green () {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 25),
                Arguments.of(3, 36)
        );
    }
}