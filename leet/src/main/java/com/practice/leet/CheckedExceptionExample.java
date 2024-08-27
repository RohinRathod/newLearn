package com.practice.leet;

//Custom Checked Exception
class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}

public class CheckedExceptionExample {
	public static void main(String[] args) {
		try {
			int a = divide(10, 0);
		} catch (CustomCheckedException e) {
			System.out.println("Caught checked exception: " + e.getMessage());
		}
	}

	// Method that throws a custom checked exception
	public static int divide(int numerator, int denominator) throws CustomCheckedException {
		try {
			return numerator / denominator;
		} catch (ArithmeticException e) {
			throw new CustomCheckedException("Division by zero error");
		}
	}
}
