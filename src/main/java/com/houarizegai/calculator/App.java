package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;

public class App {

    
    /**
     * This method is the entry point of the program.
     * It creates an instance of the CalculatorUI class and starts the calculator application.
     *
     * @param args the command line arguments
     * @throws Exception if an error occurs during the execution of the program
     *
     * Example usage:
     *
     * ```java
     * public static void main(String[] args) {
     *     try {
     *         new CalculatorUI();
     *     } catch (Exception e) {
     *         System.out.println("An error occurred: " + e.getMessage());
     *     }
     * }
     * ```
     */
    public static void main(String[] args) {
        
        new CalculatorUI();
    }
}
