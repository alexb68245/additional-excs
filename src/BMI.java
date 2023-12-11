//Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
//Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula:
//The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
//values. Your program should write "BMI optimal" or "BMI not optimal", according to the
//assumptions above.

public class BMI {
    public static boolean calculateBMI(float weight, int height){
        float bmi = weight / (float) Math.pow((height / 100), 2);
        return bmi >= 18.5 && bmi <= 24.9;
    }
}
