package org.example;

public class Main {
    public static void main(String[] args) {

        String word = "taco cat";

        if (PalindromeChecker.isPalindrome(word)) {
            System.out.println(word + " є паліндромом.");
        } else {
            System.out.println(word + " не є паліндромом.");
        }
    }

}