package fr.hamza;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumbersInWordTest {
      
    @Test
    void extractTest() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("789");
        arr.add("456");
        arr.add("123");

        assertEquals(arr, NumbersInWords.extract("123456789"));
    }

    @Test
    void extractSequenceTest() {
        assertArrayEquals(new String[] { "1", "2", "3" }, NumbersInWords.extractSequence("123"));
    }

    @Test
    void translateUnityTest() {
        assertEquals("", NumbersInWords.translateUnity("0"));
        assertEquals("one", NumbersInWords.translateUnity("1"));
        assertEquals("two", NumbersInWords.translateUnity("2"));
        assertEquals("three", NumbersInWords.translateUnity("3"));
        assertEquals("four", NumbersInWords.translateUnity("4"));
        assertEquals("five", NumbersInWords.translateUnity("5"));
        assertEquals("six", NumbersInWords.translateUnity("6"));
        assertEquals("seven", NumbersInWords.translateUnity("7"));
        assertEquals("eight", NumbersInWords.translateUnity("8"));
        assertEquals("nine", NumbersInWords.translateUnity("9"));
    }

    @Test
    void translateDecadeTest() {
        assertEquals("", NumbersInWords.translateDecade("0"));
        assertEquals("ten", NumbersInWords.translateDecade("1"));
        assertEquals("twenty", NumbersInWords.translateDecade("2"));
        assertEquals("thirty", NumbersInWords.translateDecade("3"));
        assertEquals("fourty", NumbersInWords.translateDecade("4"));
        assertEquals("fifty", NumbersInWords.translateDecade("5"));
        assertEquals("sixty", NumbersInWords.translateDecade("6"));
        assertEquals("seventy", NumbersInWords.translateDecade("7"));
        assertEquals("eighty", NumbersInWords.translateDecade("8"));
        assertEquals("ninety", NumbersInWords.translateDecade("9"));
    }

    @Test
    void translateHundredsTest() {
        assertEquals("", NumbersInWords.translateHundreds("0"));
        assertEquals("one hundred", NumbersInWords.translateHundreds("1"));
        assertEquals("two hundred", NumbersInWords.translateHundreds("2"));
        assertEquals("three hundred", NumbersInWords.translateHundreds("3"));
        assertEquals("four hundred", NumbersInWords.translateHundreds("4"));
        assertEquals("five hundred", NumbersInWords.translateHundreds("5"));
        assertEquals("six hundred", NumbersInWords.translateHundreds("6"));
        assertEquals("seven hundred", NumbersInWords.translateHundreds("7"));
        assertEquals("eight hundred", NumbersInWords.translateHundreds("8"));
        assertEquals("nine hundred", NumbersInWords.translateHundreds("9"));
    }

    @Test
    void translateBlockOf3Test() {
        assertEquals("one hundred twenty three", NumbersInWords.translateBlockOf3("123"));
        assertEquals("nine hundred fifty four", NumbersInWords.translateBlockOf3("954"));
    }

    @Test
    void getPowerOfThousandTest() {
        assertEquals("", NumbersInWords.getPowerOfThousand(0));
        assertEquals("thousand", NumbersInWords.getPowerOfThousand(1));
        assertEquals("million", NumbersInWords.getPowerOfThousand(2));
        assertEquals("billion", NumbersInWords.getPowerOfThousand(3));
    }

    @Test
    void numbersInWordsTest() {
        assertEquals(
                "nine hundred and seventy six billion, one hundred and twenty three million, four hundred and fifty six thousand, seven hundred and nineteen",
                NumbersInWords.numbersInWords("976123456719"));
    }

    @Test
    void wordInNumberTest() {
        assertEquals("1", NumbersInWords.wordInNumber("one"));
        assertEquals("2", NumbersInWords.wordInNumber("two"));
        assertEquals("3", NumbersInWords.wordInNumber("three"));
        assertEquals("4", NumbersInWords.wordInNumber("four"));
        assertEquals("5", NumbersInWords.wordInNumber("five"));
        assertEquals("6", NumbersInWords.wordInNumber("six"));
        assertEquals("7", NumbersInWords.wordInNumber("seven"));
        assertEquals("8", NumbersInWords.wordInNumber("eight"));
        assertEquals("9", NumbersInWords.wordInNumber("nine"));
        assertEquals("10", NumbersInWords.wordInNumber("ten"));
        assertEquals("11", NumbersInWords.wordInNumber("eleven"));
        assertEquals("12", NumbersInWords.wordInNumber("twelve"));
        assertEquals("13", NumbersInWords.wordInNumber("thirteen"));
        assertEquals("14", NumbersInWords.wordInNumber("fourteen"));
        assertEquals("15", NumbersInWords.wordInNumber("fifteen"));
        assertEquals("16", NumbersInWords.wordInNumber("sixteen"));
        assertEquals("17", NumbersInWords.wordInNumber("seventeen"));
        assertEquals("18", NumbersInWords.wordInNumber("eighteen"));
        assertEquals("19", NumbersInWords.wordInNumber("nineteen"));
        assertEquals("2", NumbersInWords.wordInNumber("twenty"));
        assertEquals("3", NumbersInWords.wordInNumber("thirty"));
        assertEquals("4", NumbersInWords.wordInNumber("fourty"));
        assertEquals("5", NumbersInWords.wordInNumber("fifty"));
        assertEquals("6", NumbersInWords.wordInNumber("sixty"));
        assertEquals("7", NumbersInWords.wordInNumber("seventy"));
        assertEquals("8", NumbersInWords.wordInNumber("eighty"));
        assertEquals("9", NumbersInWords.wordInNumber("ninety"));

        assertEquals(null, NumbersInWords.wordInNumber("foo"));
        assertEquals(null, NumbersInWords.wordInNumber(""));
        assertEquals(null, NumbersInWords.wordInNumber(null));
    }

    @Test
    void wordsInNumberTest() {
        assertEquals("976123456719", NumbersInWords.wordsInNumbers(
                "nine hundred and seventy six billion, one hundred and twenty three million, four hundred and fifty six thousand, seven hundred and nineteen"));

    }
}
