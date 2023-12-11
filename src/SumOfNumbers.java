//Write an application that gets one positive number (type int) from the user and calculates
//a sum of digits of the given number. Hint: to make some operations on every single digit
//of the number (digit by digit), you can calculate the remainder of dividing the number by
//10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
//digit)

public class SumOfNumbers {
    public static int calculateSum(int number){
        int sum = 0;
        for (int i = number; i >= 0 ; i--){
            sum += (number % 10);
            number = number / 10;
            if (number == 0){
                break;
            }
        }
        return sum;
    }
}
