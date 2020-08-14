package com.denisfeliciano.binary_converter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.denisfeliciano.binary_converter.BinaryConverter;
import com.denisfeliciano.binary_converter.NumeroInvalidoException;

public class BinaryConveterTest {

	@Test
	public void shouldReturnTheInputWhoUserEnterWith() {
		BinaryConverter binaryConverter = new BinaryConverter();

		binaryConverter.enterWithBinaryNumberInput("0011");

		assertEquals("0011", binaryConverter.getBinaryInput());

	}

	@Test
	public void shouldReturnTheNumberOfBinaryAtTheIndexWhoUserEnterWith() {

		BinaryConverter binaryConverter = new BinaryConverter();

		binaryConverter.enterWithBinaryNumberInput("10110");

		assertEquals("1", binaryConverter.getInputAt(0));
		assertEquals("0", binaryConverter.getInputAt(1));
		assertEquals("1", binaryConverter.getInputAt(2));
		assertEquals("1", binaryConverter.getInputAt(3));
		assertEquals("0", binaryConverter.getInputAt(4));

	}

	@Test
	public void shouldReturnTheTotalAmountOfBinaryNumbersOfTheInput() {

		BinaryConverter binaryConverter = new BinaryConverter();

		binaryConverter.enterWithBinaryNumberInput("10101");

		assertEquals(5, binaryConverter.getQuantidadeDeNumeros());
	}

	@Test
	public void shouldReturnTheDecimalRepresentationOfBinaryInput() {

		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.enterWithBinaryNumberInput("11001");

		assertEquals(25, binaryConverter.getDecimalOfBinary());
	}

	@Test(expected = NumeroInvalidoException.class)
	public void shouldThrowsExceptionIfUserEnterWithNonPositiveNumber() {
		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.enterWithBinaryNumberInput("-123");
	}

	@Test(expected = NumeroInvalidoException.class)
	public void shouldThrowsExceptionIfTheUserEnterWithNonNumber() {
		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.enterWithBinaryNumberInput("R");
	}
}
