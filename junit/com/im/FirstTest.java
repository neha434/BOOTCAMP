
/* Q.1 Guidelines
1. All testcases need to have three sections: Given, when, then
2. Test name should follow the convention as learnt from the video tutorial
3. Write tests for all the branches of the functions. Also identify and write tests for the edge cases
1. Write all possible (including failure, exception case) Unit Tests for all the methods in First.java.*/

package com.im;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    static First first;

    @BeforeAll
    static void creationFirstClassObject() {
        first = new First();
    }

    @Test
    void shouldReturnNewStringWhenSubstringFound() {
        //given
        String mainString = "My name is Neha Rai";
        String findstring = "Neha";
        String replacedString = "Arjun";
        String expectedString = "My name is Arjun";

        //when
        String calculateString = first.replaceSubString(mainString, findstring, replacedString);

        //then
        assertEquals(expectedString, calculateString);
    }

    @Test
    void shouldReturnOriginalStringWhenSubstringNotFound() {
        //given
        String mainString = "My name is Neha Rai";
        String findstring = "Arjun";
        String replacedString = "Raj";
        String expectedString = "My name is Neha Rai";

        //when
        String calculateString = first.replaceSubString(mainString, findstring, replacedString);

        //then
        assertEquals(expectedString, calculateString);

    }

    @Test
    void shouldReturnOddElementOnlyWhenOddElementExistAfterFilterEvenElement() {
        //given
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        List<Integer> expectedlist = new ArrayList<>();
        expectedlist.add(1);
        expectedlist.add(3);
        expectedlist.add(5);

        //when
        List calculatelist = first.filterEvenElements(list);

        //then
        assertEquals(expectedlist, calculatelist);

    }

    @Test
    void shouldThrowExceptionInvalidInputWhenListNotExist() {
        //given
        List<BigDecimal> list = null;
        //List<BigDecimal> list=new ArrayList<>();

        //when
        try {
            first.calculateAverage(list);
        }

        //then
        catch (RuntimeException e) {
            System.out.println(e);

        }
    }

    @Test
    void shouldThrowExceptionInvalidInputWhenListIsEmpty() {
        //given
        List<BigDecimal> list = new ArrayList<>();

        //when
        try {
            first.calculateAverage(list);
        }

        //then
        catch (RuntimeException r) {
            System.out.println(r);

        }
    }

    @Test
    void shouldReturnAveragevalueWhenListContainsElement() {

        //given
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new BigDecimal(1234567));
            list.add(new BigDecimal(1234567));
            list.add(new BigDecimal(1234567));
            list.add(new BigDecimal(1234567));
        }
        BigDecimal expectedAverage = new BigDecimal(1234567);

        //when
        BigDecimal calculateAverage = first.calculateAverage(list);

        //then
        assertEquals(expectedAverage, calculateAverage);
    }

    @Test
    void shouldReturnTrueWhenStringIspalindrome() {
        //given
        String originalinput = "abcd";

        //when
        boolean palindromecheck = first.isPallindrome(originalinput);

        //then
        assertFalse(palindromecheck);

    }
}
