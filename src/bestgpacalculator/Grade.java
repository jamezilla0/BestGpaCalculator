/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestgpacalculator;

/**
 *
 * @author james
 */
public class Grade {
    private String letter;
    private double value;
    private double range[];
    public static Decryptor decrypt = new Decryptor();

    public Grade(double number) {
       value = number;
       letter = Grade.decrypt.decryptNumberGrade(number);
//        System.out.println("Grade value input: " + number);
//        System.out.println("Grade value set: " + value);
    }

    public Grade(String character){
        range = Grade.decrypt.decryptletterGrade(character);
        letter = character;
        value = ((range[0] + range[1]) / 2);
    }

    public String getLetterGrade(){
        return letter;
    }

    public double getValue(){
        return value;
    }
}
