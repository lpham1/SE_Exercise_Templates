package test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		int expectedResult = 2+3;
		int actualResult = calculator.add(2, 3);
		assertEquals(expectedResult, actualResult);
				
	}

	@ParameterizedTest
	@CsvSource({"100,1","-5,5","-1,-2"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		int expectedResult = valueOne + valueTwo;
		int actualResult = calculator.add(valueOne, valueTwo);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		int expectedResult = 5-3;
		int actualResult = calculator.sub(5, 3);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		int expectedResult = 100*2;
		int actualResult = calculator.multiply(100, 2);
		assertEquals(expectedResult, actualResult);
	}
	

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		float expectedResult = 100/2;
		float actualResult = calculator.divide(100, 2);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		ArrayIndexOutOfBoundsException ex =  Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> 
		calculator.divide(10, 0) );
String expectedMessage = "ZeroDivisionError";
String actualMessage = ex.getMessage();

assertTrue(actualMessage.contains(expectedMessage));
	}
}
