package org.example;
import java.util.*;

public class Main {
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) throws splitNumberException {

        System.out.println(convertDigitsToRoman(SplitNumbersIntoDigits(3245)));
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
        String[][] roman = new String[][]{{"I", "V", "X"}, {"X", "L", "C"}, {"C", "D", "M"}, {"M"}};
        String allDigitInRoman = "";
        String digitInRoman = "";
        int pwr = 4;
        for (int i = 0; i < digit.length; i++) {
            pwr--;
            digitInRoman = "";
            if (digit[i] > 0 && digit[i] < 4) {
                for (int j = 0; j < digit[i]; j++) {
                    digitInRoman += roman[pwr][0];
                }
            } else if (digit[i] == 4) {
                digitInRoman = roman[pwr][0] + roman[pwr][1];
            } else if (digit[i] == 5) {
                digitInRoman = roman[pwr][1];
            } else if (digit[i] > 5 && digit[i] < 9) {
                String plusA = "";
                for (int k = 5; k < digit[i]; k++) {
                    plusA += roman[pwr][0];
                }
                digitInRoman = roman[pwr][1] + plusA;
            } else if (digit[i] == 9) {
                digitInRoman = roman[pwr][0] + roman[pwr][2];
            }
            allDigitInRoman += digitInRoman;
        }
        return allDigitInRoman;
    }
}