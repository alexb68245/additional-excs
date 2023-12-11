//Write an application that reads a text from the user (type String) and checks whether the
//user sneezed, i.e. whether the text equals Ͽachooo!Ѐ with one or more letter "o" at the end
//of the expression (so both 'acho!' and 'achooooooo!Ѐ are correct). Hint: use a regular
//expression with the appropriate quantifier

import java.util.Scanner;
import java.util.regex.Pattern;

public class Sneeze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();

        if (Pattern.matches("acho*",text)){
            System.out.println("Bless you!");
        }else {
            System.out.println("OK");
        }
    }
}