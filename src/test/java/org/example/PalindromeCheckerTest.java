package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeWord() {
        assertTrue(PalindromeChecker.isPalindrome("wow"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        assertFalse(PalindromeChecker.isPalindrome("kyiv"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithNullString() {
        assertFalse(PalindromeChecker.isPalindrome("null"));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithMixedCasePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("123321"));
    }

    @Test
    public void testIsPalindromeWithPhrase() {
        assertTrue(PalindromeChecker.isPalindrome("Never odd or even"));
    }
}
