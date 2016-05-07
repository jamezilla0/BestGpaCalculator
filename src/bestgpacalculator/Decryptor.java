package bestgpacalculator;

/**
 * Class used to convert letter or number grade to their counterparts.
 * @author james & Steven
 */
public class Decryptor {

    public double[] decryptletterGrade(String letter) {
        //range for the letter grades
        //Steven
        double range[] = new double[2];

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

        return range;
    }

    public String decryptNumberGrade(double value) {
        //Author: James Bernard
        //Converts number value of grade to its letter counter part.
        String letter = "F";
        
        if (value >= 97.5) {
            letter = "A+";
        } else if (value >= 92.5) {
            letter = "A";
        } else if (value >= 90) {
            letter = "A-";
        } else if (value >= 87.5) {
            letter = "B+";
        } else if (value >= 82.5) {
            letter = "B";
        } else if (value >= 80) {
            letter = "B-";
        } else if (value >= 77.5) {
            letter = "C+";
        } else if (value >= 72.5) {
            letter = "C";
        } else if (value >= 70) {
            letter = "C-";
        } else if (value >= 67.5) {
            letter = "D+";
        } else if (value >= 62.5) {
            letter = "D";
        } else if (value >= 60) {
            letter = "D-";
        }else{
            letter = "F";
        }

        return letter;
    }
}
