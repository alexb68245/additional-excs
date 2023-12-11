//Write an application that reads from the user 10 arbitrarily large numbers (variables of
//type int) and prints those that occurred at least twice.

import java.util.Scanner;

public class Twice {
    public static void occurredTwice(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        //populate array
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++ ){
                if (numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                }
            }

        }

    }
}
