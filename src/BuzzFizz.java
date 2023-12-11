//Write an application that takes a positive number from the user (type int) and writes all
//numbers from 1 to the given number, each on the next line, with the following changes:
//● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//● in place of numbers divisible by 7, instead of a number the program should write
//"Buzz"
//● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

public class BuzzFizz {
    public static void fizzBuzz(int number){
        for (int i = 1; i <= number; i++){
            if (i % 7 == 0 && i % 3 == 0){
                System.out.println("Fizz Buzz");
            }else if (i % 7 == 0 ){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }
}
