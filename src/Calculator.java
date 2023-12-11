//Write an application that implements a simple calculator. The application should:
//a. read first number (type float)
//b. read one of following symbols: + - / *
//c. read second number (type float)
//d. return a result of given mathematical operation
//If the user provides a symbol other than supported, the application should print "Invalid
//symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
//principles of mathematics), the application should print "Cannot calculate".

public class Calculator {
    public static float calculate(float firstNumber, char symbol, float secondNumber){
        float operation = 0;
        switch (symbol){
            case '+':
                operation = firstNumber + secondNumber;
                break;
            case '-':
                operation = firstNumber - secondNumber;
                break;
            case '/':
                if (secondNumber == 0){
                    System.out.println("Cannot calculate");
                }else {
                    operation = firstNumber / secondNumber;
                }
                break;
            case '*':
                operation = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Please enter a correct symbol");
                break;
        }
        return operation;
    }
}
