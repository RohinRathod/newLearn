package com.practice.leet;

public interface Learn {

	int car = 10; // This is implicitly "public static final"

	void driveCar(); // This is implicitly "public abstract"

	public void driveRickshaw(); // This is explicitly "public", and implicitly "abstract"

	public abstract void driveAude(); // This is explicitly "public abstract"

	public static void driveAeroplane() { // This is explicitly "public static"
		// Method body
		helperMethod();

	}

	private static void helperMethod() {
		System.out.println("Helper method");
	}

	default void driveBMW() {
	}

}
