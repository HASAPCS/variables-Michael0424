package com.example;

public class VariablesAssignment {

    // TODO: Declare and initialize a byte variable with any value between 1 and 127
    byte byteVariable = 11;
    // TODO: Declare and initialize a short variable with any value between 1 and 32767
    short shortVariable = 32767;

    // TODO: Declare and initialize an int variable with any positive value
    int intVariable = 24;

    // TODO: Declare and initialize a long variable with any positive value
    long longVariable = 2L;

    // TODO: Declare and initialize a float variable with any positive value
    float floatVariable = 4.0f;

    // TODO: Declare and initialize a double variable with any positive value
    double doubleVariable = 0.11d;

    // TODO: Declare and initialize a char variable with the initial of your first name
    char charVariable = 'L';

    // TODO: Declare and initialize a boolean variable with the value true or false
    boolean booleanVariable = true;

    // TODO: Create a method that accepts two integers as parameters and returns their sum
    public int sum(int a, int b) {
        return a + b; // Change this line to return the actual sum
    }

    // TODO: Create a method that accepts two double parameters and returns their product
    public double product(double a, double b) {
        return a * b; // Change this line to return the actual product
    }
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        // Loop through the input string in reverse order and append each character to the 'reversed' StringBuilder
        for (int i = input.length() - 1; i >= 0; i -=1) {
            reversed.append(input.charAt(i));
        }

        // Convert the StringBuilder to a String and return it
        return reversed.toString();
    }
}


