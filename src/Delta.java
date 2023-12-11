//Write a program for solving a quadratic equation. The program should take three integers
//(coefficients of the quadratic equation a, b, c) and calculate the roots of the
//equation
// If delta ∆ comes out negative, print "Delta negative" and exit the program.
//Formulas youЀll need:

public class Delta {
    public static void equation(int a, int b, int c){
        double x1, x2;
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0){
            System.out.println("Delta is negative");
        }else {
            x1 = (-b + Math.sqrt(delta))/ (2 * a);
            System.out.println("X1 is " + x1);
            x2 = (-b - Math.sqrt(delta))/ (2 * a);
            System.out.println("X2 is " + x2);
        }
    }
}
