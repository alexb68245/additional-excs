//Write an application that reads a text from the user (type String) and counts a percentage
//of occurrences of a space character.

public class Spaces {
    public static double countPercentage(String text){
        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                counter++;
            }
        }
        return ((double) counter / text.length()) * 100;
    }
}
