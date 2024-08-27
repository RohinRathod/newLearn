package com.practice.leet;

public abstract class Abstr {


    // `public` keyword is explicit
    int car = 10; // Implicitly `package-private` (default access) and not `final`

    // `default access` (package-private) method - no access modifier specified
    void driveCar() {
    }

    // `public` keyword is explicit
    public void driveRickshaw() {
    }

    // `public abstract` method - `abstract` keyword is explicit
    public abstract void driveAude();

    // `public static` method - `static` and `public` keywords are explicit
    public static void driveAeroplane() {
        // Calling another static method within the same class
        helperMethod();
    }

    // `private static` method - `static` and `private` keywords are explicit
    private static void helperMethod() {
        System.out.println("Helper method");
    }
}
