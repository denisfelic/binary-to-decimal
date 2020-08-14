package com.denisfeliciano.binary_converter;

public class BinaryConverter {

	private String binary_number;
	private int totalOfCharacterInTheInput;
	private int decimalRepresentationOfBinary;

	/**
	 * Constructor of BinaryConverter class
	 */
	public BinaryConverter() {
		
	}
	
	/**
	 * Enter with binary Number
	 * @param userInputBinary
	 * @throws NumeroInvalidoException
	 * @author Denis Feliciano
	 */
	public void enterWithBinaryNumberInput(String userInputBinary) {
		verifyIfInputIsValid(userInputBinary);
		this.binary_number = userInputBinary;
		this.totalOfCharacterInTheInput = userInputBinary.length();
		this.decimalRepresentationOfBinary = calculatesTheDecimalRepresentationOfBinary();
	}

	/**
	 * @param userInputBinary
	 */
	private void verifyIfInputIsValid(String userInputBinary) {
		if(userInputBinary == null)
			throw new NumeroInvalidoException("You need to pass some posive number.");
		
			
		int representacaoNumericaDoBinario = Integer.parseInt(userInputBinary);
		if( representacaoNumericaDoBinario <= 0)
			throw new NumeroInvalidoException("The number need to be positive.");
	}

	/**
	 * Gets the Binary input the user has entered.
	 * @return
	 */
	public String getBinaryInput() {
		return this.binary_number;
	}

	public String getInputAt(int index) {
		String charAt = String.valueOf(this.binary_number.charAt(index));
		return charAt;
	}

	/**
	 * Get the total of character of the input
	 * @return
	 */
	public int getQuantidadeDeNumeros() {
		return this.totalOfCharacterInTheInput;
	}

	/**
	 * Get the decimal representation of the binary input.
	 * @return
	 */
	public int getDecimalOfBinary() {
		return this.decimalRepresentationOfBinary;
	}

	
	private int calculatesTheDecimalRepresentationOfBinary() {

		int[] n = new int[totalOfCharacterInTheInput];
		int totalOfBinaryNums = totalOfCharacterInTheInput - 1;
		int sum = 0;
		int count = 0;
		for (int i = totalOfBinaryNums; i >= 0; i--) {
			int num = Integer.parseInt(getInputAt(i));

			n[count] = (int) (num * (Math.pow(2, count)));
			sum += n[count];
			count++;
		}

		return sum;
	}

}
