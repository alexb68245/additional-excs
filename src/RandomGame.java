//Write an application that will play "too much, too little" game with you. At the beginning
//the application should randomly choose a number from 0 to 100 (hint: use the
//Random.nextInt() method) and wait for the user to enter a number. If the user gives a
//number greater than the number chosen by the computer, your application should print
//"too much" and wait for the next number. If the user gives a smaller number, the
//application should print "not enough" and wait for the next number in the same way. If
//the user provides the exact value, the application should print the word
//"Congratulations!" and finish.

import java.util.*;


public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(0,100);

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        do {
            if (randomNumber > userNumber){
                System.out.println("Too little!");
            }else if (randomNumber < userNumber){
                System.out.println("Too much!");
            }

            userNumber = scanner.nextInt();

        }while (randomNumber != userNumber);

        System.out.println("Congratulations!");
    }
}