package fr.hamza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Unit test for simple App.
 */
class LeapYearTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testIsDivisibleBy400() {
        assertTrue(LeapYear.isDivisibleBy400(400));
        assertFalse(LeapYear.isDivisibleBy400(500));
    }

    @Test
    void testIsDivisibleBy100() {
        assertFalse(LeapYear.isDivisibleBy100(505));
        assertTrue(LeapYear.isDivisibleBy100(500));
    }

    @Test
    void testIsDivisibleBy100NotBy400() {
        assertTrue(LeapYear.isDivisibleBy100NotBy400(500));
        assertFalse(LeapYear.isDivisibleBy100NotBy400(400));
    }

    @Test
    void testIsDivisibleBy4() {
        assertTrue(LeapYear.isDivisibleBy4(400));
        assertFalse(LeapYear.isDivisibleBy4(5));
    }

    @Test
    void testIsDivisibleBy4NotBy100() {
        assertTrue(LeapYear.isDivisibleBy4NotBy100(4));
        assertFalse(LeapYear.isDivisibleBy4NotBy100(400));
    }

    @Test
    void testIsLeapYear() {
        assertTrue(LeapYear.isLeapYear(400));
        assertTrue(LeapYear.isLeapYear(404));
        assertFalse(LeapYear.isLeapYear(100));
        assertFalse(LeapYear.isLeapYear(500));
        assertFalse(LeapYear.isLeapYear(2019));
    }
}
