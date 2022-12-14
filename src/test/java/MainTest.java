
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.example.splitNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void SplitNumbersIntoDigits() throws Exception {

        int[] expectedResult4 = {0, 0, 0, 4};
        assertArrayEquals(expectedResult4, Main.SplitNumbersIntoDigits(4));
        int[] expectedResult5 = {0, 0, 0, 9};
        assertArrayEquals(expectedResult5, Main.SplitNumbersIntoDigits(9));

    }

    @Test
    public void SplitNumbersInto2Digits() throws Exception{

        assertArrayEquals(new int[]{0, 0, 1, 4}, Main.SplitNumbersIntoDigits(14));
        assertArrayEquals(new int[]{0, 0, 1, 9}, Main.SplitNumbersIntoDigits(19));
        assertArrayEquals(new int[]{0, 0, 2, 9}, Main.SplitNumbersIntoDigits(29));

    }

    @Test
    public void SplitNumbersInto3Digits() throws Exception{

        assertArrayEquals(new int[]{0, 1, 1, 4}, Main.SplitNumbersIntoDigits(114));
        assertArrayEquals(new int[]{0, 4, 1, 9}, Main.SplitNumbersIntoDigits(419));
        assertArrayEquals(new int[]{0, 2, 2, 9}, Main.SplitNumbersIntoDigits(229));

    }

    @Test
    public void SplitNumbersInto4Digits() throws Exception{

        assertArrayEquals(new int[]{1, 0, 1, 4}, Main.SplitNumbersIntoDigits(1014));
        assertArrayEquals(new int[]{2, 0, 1, 9}, Main.SplitNumbersIntoDigits(2019));

    }

    @Test
    public void invalidNumber() throws Exception {
        Assertions.assertThrows(splitNumberException.class, ()->{Main.SplitNumbersIntoDigits(-1);});
        Assertions.assertThrows(splitNumberException.class, ()->{Main.SplitNumbersIntoDigits(-10);});
        Assertions.assertThrows(splitNumberException.class, ()->{Main.SplitNumbersIntoDigits(4210);});
        Assertions.assertThrows(splitNumberException.class, ()->{Main.SplitNumbersIntoDigits(5555);});
        Assertions.assertThrows(splitNumberException.class, ()->{Main.SplitNumbersIntoDigits(-3999);});
    }

    @Test
    public void TwoNumberInRoman() throws Exception {
        Assertions.assertEquals("VII",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(7)));
        Assertions.assertEquals("I",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(1)));
        Assertions.assertEquals("V",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(5)));
        Assertions.assertEquals("III",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(3)));
        Assertions.assertEquals("VIII",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(8)));

    }

    @Test
    public void unitNumberInRoman() throws Exception {
        Assertions.assertEquals("XXXVII",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(37)));
        Assertions.assertEquals("LXXI",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(71)));
        Assertions.assertEquals("LV",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(55)));
        Assertions.assertEquals("XCIII",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(93)));
        Assertions.assertEquals("XX",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(20)));

    }
    @Test
    public void inRomanNumbers() throws Exception {
        Assertions.assertEquals("CMXXXVII",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(937)));
        Assertions.assertEquals("MMMCMXCIX",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(3999)));
        Assertions.assertEquals("MXX",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(1020)));
        Assertions.assertEquals("DLV",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(555)));
        Assertions.assertEquals("MMMDCCCLXXXVIII",Main.convertDigitsToRoman(Main.SplitNumbersIntoDigits(3888)));

    }
}