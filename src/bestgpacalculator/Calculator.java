package bestgpacalculator;

import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class Calculator {
    //Algorithm for calculating the GPA
    private ArrayList<Grade> gradeList = new ArrayList<>();
    
    public Calculator(){
        
    }

    private static class Grade {
        private String letter;
        private double value;
        private double range[];
        
        public Grade(int number) {
            
        }
        
        public Grade(String character){
            
        }
        
        public void decryptletterGrade(){
            //range for the letter grades
            //Steven
            
            switch (letter) {
                case "A+":
                    range[0] = 97.5;
                    range[1] = 100;                   
                    break;
                    
                case "A":
                    range[0] = 92.5;
                    range[1] = 97.4;
                    break;
                    
                case "A-":
                    range[0] = 90.0;
                    range[1] = 92.4;
                    break;
                    
                    case "B+":
                    range[0] = 87.5;
                    range[1] = 89.9;
                    break;
                    
                    case "B":
                    range[0] = 82.5;
                    range[1] = 87.4;
                    break;
                    
                    case "B-":
                    range[0] = 80.0;
                    range[1] = 82.4;
                    break;
                    
                    case "C+":
                    range[0] = 75.5;
                    range[1] = 79.9;
                    break;
                    
                    case "C":
                    range[0] = 72.5;
                    range[1] = 75.4;
                    break;
                    
                    case "C-":
                    range[0] = 70.0;
                    range[1] = 72.4;
                    break;
                    
                    case "D+":
                    range[0] = 67.5;
                    range[1] = 69.9;
                    break;
                    
                    case "D":
                    range[0] = 62.5;
                    range[1] = 67.4;
                    break;
                    
                    case "D-":
                    range[0] = 60.0;
                    range[1] = 62.4;
                    break;
                default:
                    range[0] = 0.0;
                    range[1] = 59.9;
            }
        }
        
        public void decryptValueGrade(){
            //Author: James Bernard
            //Converts number value of grade to its letter counter part.
            if(value <= 100){
              letter = "A+";
           }else if(value <= 97.4){
              letter = "A";
           }else if(value <= 92.4){
              letter = "A-";
           }else if(value <= 89.9){
              letter = "B+";
           }else if(value <= 87.4){
              letter = "B";
           }else if(value <= 82.4){
               letter = "B-";
           }else if(value <= 79.9){
               letter =  "C+";
           }else if(value <= 77.4){
               letter = "C";
           }else if(value <= 72.4){
               letter = "C-";
           }else if(value <= 69.9){
               letter = "D+";
           }else if(value <= 67.4){
               letter = "D";
           }else if(value <= 62.4){
               letter = "D-";
           }else if(value <= 60){
               letter = "F";
           }
        }
        
        public String getLetterGrade(){
            return letter;
        }
        
        public double getValue(){
            return value;
        }
    }
    
    
}
