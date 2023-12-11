//Write an application that "stutters", that is, reads the user's text (type String), and prints
//the given text, in which each word is printed twice.
//For example, for the input: "This is my test" the application should print "This This is is
//my my test test".

public class Stutters {

    public static void stutters(String text){
        //text = text.replace(",", "");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++){
            System.out.print(" "+words[i] + " " + words[i]);
        }
    }
}
