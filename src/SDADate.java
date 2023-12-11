//Write an application that will read from the user the date of your next SDA classes and
//calculate how many days are left to them.
//Hint: read the date as String and parse it to LocalDate. Get the current date using
//LocalDate.now() method.

import java.time.LocalDate;
import java.time.Period;

public class SDADate {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate nextDate = LocalDate.of(2023, 8, 5);

        Period difference = Period.between(dateNow, nextDate);
        System.out.println(difference.getDays());
    }
}