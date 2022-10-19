package org.example;

import java.util.*;

public class Main {
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) throws splitNumberException {
        //System.out.println(convertDigitsToRoman(SplitNumbersIntoDigits(3245)));
    }

    public static int[] SplitNumbersIntoDigits(int numberToConvert) throws splitNumberException {
        //converting the number into digits
        if (numberToConvert < 0 || numberToConvert > 3999) {
            throw new splitNumberException("Enter number between 0 and 4000: ");
        }
        int[] digit = new int[4];
        digit[0] = numberToConvert / 1000;
        digit[1] = (numberToConvert % 1000) / 100;
        digit[2] = (numberToConvert % 100) / 10;
        digit[3] = numberToConvert % 10;
        return digit;
    }

    public static String convertDigitsToRoman(int[] digit) {
        //creating multidimensional array to save characters of unit, ten, a hundred and a thousand
        String[][] roman = new String[][]{{"I", "V", "X"}, {"X", "L", "C"}, {"C", "D", "M"}, {"M"}};
        String allDigitsInRoman = "";
        String eachDigitInRoman;
        int pwr = digit.length;
        for (int i = 0; i < digit.length; i++) {

            pwr--; //it goes as the count in array increases after iterating every array of digit so 4-1, 3-1,..
            eachDigitInRoman = ""; //emptying String after each loop of digit.length

            if (digit[i] > 0 && digit[i] < 4) {
                for (int j = 0; j < digit[i]; j++) {
                    eachDigitInRoman += roman[pwr][0];
                }
            } else if (digit[i] == 4) {
                eachDigitInRoman = roman[pwr][0] + roman[pwr][1];
            } else if (digit[i] == 5) {
                eachDigitInRoman = roman[pwr][1];
            } else if (digit[i] > 5 && digit[i] < 9) {
                String plusOne = "";
                for (int k = 5; k < digit[i]; k++) {
                    plusOne += roman[pwr][0];
                }
                eachDigitInRoman = roman[pwr][1] + plusOne;
            } else if (digit[i] == 9) {
                eachDigitInRoman = roman[pwr][0] + roman[pwr][2];
            }
            allDigitsInRoman += eachDigitInRoman;
        }
        return allDigitsInRoman;
    }
}