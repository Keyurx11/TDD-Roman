//Old method
/*
package org.example;
import java.util.*;

public class Main {
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) throws splitNumberException {

        ConvertArabicToRoman(SplitNumbersIntoDigits(321));
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

    public static String ConvertArabicToRoman(int[] digit) {
        //char representation of roman number
        char valueOf1 = 'I';
        char valueOf5 = 'V';
        char valueOf10 = 'X';
        char valueOf50 = 'L';
        char valueOf100 = 'C';
        char valueOf500 = 'D';
        char valueOf1000 = 'M';

        //turning unit digit to a roman number
        String unit = "";
        if (digit[3] < 4) {
            for (int i = 0; i < digit[3]; i++) {
                unit += valueOf1;
            }
        } else if (digit[3] == 4) {
            unit = String.valueOf(valueOf1) + valueOf5;
        } else if (digit[3] == 5) {
            unit = String.valueOf(valueOf5);
        } else if (digit[3] > 5 && digit[3] < 9) {
            String plusUnit = "";
            for (int i = 5; i < digit[3]; i++) {
                plusUnit += valueOf1;
            }
            unit = valueOf5 + plusUnit;
        } else if (digit[3] == 9) {
            unit = String.valueOf(valueOf1) + valueOf10;
        }

        //turning tenth digit to a roman number
        String ten = "";
        if (digit[2] < 4) {
            for (int i = 0; i < digit[2]; i++) {
                ten += valueOf10;
            }
        } else if (digit[2] == 4) {
            ten = String.valueOf(valueOf10) + valueOf50;
        } else if (digit[2] == 5) {
            ten = String.valueOf(valueOf50);
        } else if (digit[2] > 5 && digit[2] < 9) {
            String plusUnit = "";
            for (int i = 5; i < digit[2]; i++) {
                plusUnit += valueOf10;
            }
            ten = valueOf50 + plusUnit;
        } else if (digit[2] == 9) {
            ten = String.valueOf(valueOf10) + valueOf100;
        }

        //turning hundred digit to a roman number
        String hundred = "";
        if (digit[1] < 4) {
            for (int i = 0; i < digit[1]; i++) {
                hundred += valueOf100;
            }
        } else if (digit[1] == 4) {
            hundred = String.valueOf(valueOf100) + valueOf500;
        } else if (digit[1] == 5) {
            hundred = String.valueOf(valueOf500);
        } else if (digit[1] > 5 && digit[1] < 9) {
            String plusUnit = "";
            for (int i = 5; i < digit[1]; i++) {
                plusUnit += valueOf100;
            }
            hundred = valueOf500 + plusUnit;
        } else if (digit[1] == 9) {
            hundred = String.valueOf(valueOf100) + valueOf1000;
        }

        ////turning thousand digit to a roman number
        String thousand = "";
        if (digit[0] < 4) {
            for (int i = 0; i < digit[0]; i++) {
                thousand += valueOf1000;
            }
        }

        String romanNumber = thousand + hundred + ten + unit;
        return romanNumber;
    }
}
 */