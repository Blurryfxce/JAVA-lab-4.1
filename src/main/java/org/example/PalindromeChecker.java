package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

        return cleanedWord.equals(reversedWord);
    }

}

