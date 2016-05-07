/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestgpacalculator;

import java.util.Scanner;

/**
 * @Class CST1201
 * @Profesor Michael Best
 * @Project Lead James Bernard
 * @Project Coordinator Nic Younge
 * @UI/UX Designer Steven Almonte
 * @Calculator Algorithm
 * @Tips Algorithm
 * @User Registration
 * @User Login/Logout
 * @Temp Save Method
 * @JDBC Save Method
 * @Temp Read Method
 * @JDBX Read Method
 */
public class BestGpaCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.print("Enter a number grade: ");
        double userInput = input.nextDouble();
        String letterGrade = Grade.decrypt.decryptNumberGrade(userInput);
        System.out.println("Your letter grade is: " + letterGrade);
        
        System.out.println("Converting grade to number range");
        double[] range = Grade.decrypt.decryptletterGrade(letterGrade);
        System.out.printf("Your grade is between %.1f and %.1f \n", range[0], range[1]);        
    }   
        
    
   
}
