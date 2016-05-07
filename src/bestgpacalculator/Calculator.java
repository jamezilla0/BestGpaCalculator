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
        
        public Grade(int number) {
            
        }
        
        public Grade(String character){
            
        }
        
        public void decryptletterGrade(){
           
        }
        
        public String getLetterGrade(){
            return letter;
        }
        
        public double getValue(){
            return value;
        }
    }
    
    
}
