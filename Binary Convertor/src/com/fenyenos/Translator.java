package com.fenyenos;

public class Translator {
	
	public static String convertBinary(String binary) {
		int decimal = 0;
		int length = binary.length();
		int power = length - 1;
		
		for(int i = 0; i < length; i++) {
			char c = binary.charAt(i);
			decimal += Character.getNumericValue(c) * (Math.pow(2, power));
			power--;
		}
		
		return String.valueOf(decimal);
	}

}
