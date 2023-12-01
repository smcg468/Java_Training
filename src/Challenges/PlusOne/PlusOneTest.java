package Challenges.PlusOne;

import Challenges.GreenNumber.GreenNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @ParameterizedTest
    @MethodSource("plusOne")
    void returnArrayPlusOne (){



    }

    private static Stream<Arguments> Green () {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 25),
                Arguments.of(3, 36)
        );
    }

}