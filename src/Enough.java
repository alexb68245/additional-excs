//Write an application that will read texts (variables of the String type) until the user gives
//the text "Enough!" and then writes the longest of the given texts (not including the text
//"Enough!"). If the user does not provide any text, write "No text provided".

import java.util.Scanner;

public class Enough {
    public static String longestString(){
        Scanner scanner = new Scanner(System.in);
        String text;
        String longestText = "";
        do {
            text = scanner.nextLine();
            if ((text.length() > longestText.length()) && !text.equals("Enough")){
                longestText = text;
            }
        }while (!text.equals("Enough"));

        return longestText;
    }
}
