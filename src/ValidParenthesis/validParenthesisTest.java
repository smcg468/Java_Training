package ValidParenthesis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validParenthesisTest {

    @Test
    void EmptyString() {
        assertFalse(validParenthesis.validParenthesis(""));
    }

    @Test
    void OpenParenthesisEntered() {
        assertFalse(validParenthesis.validParenthesis("("));
    }

    @Test
    void ClosedParenthesisEntered() {
        assertFalse(validParenthesis.validParenthesis(")"));
    }

    @Test
    void OneSetOfParenthesis() {
        assertTrue(validParenthesis.validParenthesis("()"));
    }

    @Test
    void TwoDifferentParenthesis() {
        assertFalse(validParenthesis.validParenthesis(")("));
    }

    @Test
    void OneParenthesisMissing() {
        assertFalse(validParenthesis.validParenthesis("(()"));
    }

    @Test
    void MultipleMatchingParenthesis() {
        assertTrue(validParenthesis.validParenthesis("()((()))()"));
    }

    @Test
    void MultipleMissingParenthesis() {
        assertFalse(validParenthesis.validParenthesis("()((((()()))"));
    }

}