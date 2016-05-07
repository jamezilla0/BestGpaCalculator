package bestgpacalculator;

import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class Calculator {
    //Algorithm for calculating the GPA
    private ArrayList<Grade> gradeList = new ArrayList<Grade>();
    
    public Calculator(){
        
    }
    
    public void addGrade(Grade grade){
        gradeList.add(grade);
    }
    
    public void getGpa(){
        int count = gradeList.size();
        double total = 0;
        
        for(Grade grade : gradeList){
            total += grade.getValue();
//            System.out.println("Grade Value: " + grade.getValue());
        }
        
//        System.out.println("Total score: " + total);
        
        double gpa = total / count;
        
        String gpaLetter = Grade.decrypt.decryptNumberGrade(gpa);
        
        System.out.println("Your GPA: " + gpa);
        System.out.println("Your GPA Letter Grade: " + gpaLetter);
    }
}
