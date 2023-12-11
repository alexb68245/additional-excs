//Write an application that will take a positive number from the user (type int) and
//calculate the Fibonacci number at the indicated index. For example, if the number equals
//5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
//number is the sum of the two preceding ones. For example, the first few Fibonacci
//numbers are

public class Fibonacci {

    public static void calculateFibonacci(int number){
        int a = 0,b = 1, c;
        for (int i = 0; i <= number; i ++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
