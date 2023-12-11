//Write an application that takes a number n from the user (type int) and calculates the
//sum of the harmonic series from 1 to n, according to the formula below

public class Harmonic {

    public static double calculateHarmonic(int number){
        double sum = 0;
        for (int i = 1; i <= number; i++){
            sum += (double) 1 / i;
        }
        return sum;
    }
}
