package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;


class TestCalendar {

	GregorianCalendar GregoCal = new GregorianCalendar();
	@ParameterizedTest
	@ValueSource(ints = { 1940, 1944, 1948, 1988, 1964})
	public void Should_return_true(int year) {
		// Implement
		boolean expected = GregoCal.isLeapYear(year);
		Calendar cal = new Calendar(year);
		boolean actual = cal.isLeapYear();
		assertEquals(expected, actual);
		assertEquals(true, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1930, 1921, 1997, 1999, 1955 })
	public void Should_return_false(int year) {
		// Implement
		boolean expected = GregoCal.isLeapYear(year);
		Calendar cal = new Calendar(year);
		boolean actual = cal.isLeapYear();
		assertEquals(expected, actual);
		assertEquals(false, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1924, 1978, 1999, 1953, 1947 })
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		boolean expected = GregoCal.isLeapYear(year);
		Calendar cal = new Calendar(year);
		boolean actual = cal.isLeapYear();
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1860, 2910, 1630, 100 })
	// Create a new method for boundary testing
	public void Should_throw_exception_if_year_not_in_20th_century(int year) {
		Calendar cal = new Calendar(year);
		ArrayIndexOutOfBoundsException ex =  Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> 
				cal.isLeapYear());
				Assertions.assertEquals("Year not in 20th Century", ex.getMessage());
	}
}
