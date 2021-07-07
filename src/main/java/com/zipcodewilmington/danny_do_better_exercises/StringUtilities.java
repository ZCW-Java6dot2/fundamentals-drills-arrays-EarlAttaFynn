package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String word = "Hello World";
        return word;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String word = firstSegment + secondSegment;
        return word;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String word = firstSegment + secondSegment;
        return word;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        StringBuilder word = new StringBuilder();
        for (int i = 0; i <= 2 ; i++) {
            word.append(input.charAt(i));
        }
        return word.toString();
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        StringBuilder word = new StringBuilder();
        for (int i = input.length()-3; i < input.length(); i++) {
            word.append(input.charAt(i));
        }
        return word.toString();
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if (inputValue.compareTo(comparableValue) == 0) {
            return true;
        };
        return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int position;
        int length;
        if (inputValue.length() % 2 == 0)
        {
            position = inputValue.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = inputValue.length() / 2;
            length = 1;
        }

        Character mid;
        Character result = inputValue.substring(position, position + length).charAt(0);
        return result;

    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] split = spaceDelimitedString.split(" ");
        return split[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] split = spaceDelimitedString.split(" ");
        return split[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {

        StringBuilder word = new StringBuilder(stringToReverse);
        String reverse = word.reverse().toString();

        return reverse;
    }
}
