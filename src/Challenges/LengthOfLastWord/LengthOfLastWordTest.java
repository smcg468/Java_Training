package Challenges.LengthOfLastWord;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {


    @ParameterizedTest
    @MethodSource("lengthOfLastWord")
    void returnCorrectLengthOfLastWord (String s, int answer){

        assertEquals(answer, LengthOfLastWord.lengthOfLastWord(s));

    }

    private static Stream<Arguments> lengthOfLastWord () {
        return Stream.of(
                Arguments.of("welcome to all", 3),
                Arguments.of("hello there", 5),
                Arguments.of("    ", 0)
        );
    }
}

