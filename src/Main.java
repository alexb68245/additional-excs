import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter diameter");
        //System.out.println("The perimeter is " + Circle.circlePerimeter(scanner.nextFloat()))
        //float diameter = scanner.nextFloat();
        //float perimeter = Circle.circlePerimeter(diameter);
        //System.out.println("The perimeter is " + perimeter);

        //if (BMI.calculateBMI(scanner.nextFloat(), scanner.nextInt())){
        //    System.out.println("BMI is optimal");
        //}else {
        //    System.out.println("BMI is not optimal");
        //}

        //Delta.equation(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        //BuzzFizz.fizzBuzz(scanner.nextInt());

        //System.out.println("The harmonic series is " + Harmonic.calculateHarmonic(13));

        //Fibonacci.calculateFibonacci(15);

        //System.out.println("Enter a number");
        //float firstNumber = scanner.nextFloat();
        //System.out.println("Enter a symbol");
        //char symbol = scanner.next().charAt(0);
        //System.out.println("Enter the second number");
        //float secondNumber = scanner.nextFloat();

        //System.out.println(Calculator.calculate(firstNumber, symbol, secondNumber));

        //System.out.println("Enter a number");
        //int number = scanner.nextInt();
        //System.out.println("The sum of the numbers in this number is " + SumOfNumbers.calculateSum(number));

        //System.out.println(Enough.longestString());

        //System.out.println(Spaces.countPercentage(scanner.nextLine()) + "%");

        //Stutters.stutters(scanner.nextLine());

        //System.out.println("Please enter two lower-case letters");
        //System.out.println("Their difference is " + Letters.diffOfChars(scanner.next().charAt(0), scanner.next().charAt(0)));

        //Twice.occurredTwice();

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Sequence.longestSequence(numbers));

        //System.out.println("First customer");
        //Customer firstCustomer = new Customer(1, scanner.nextLine(), 20);
        //System.out.println(firstCustomer.toString());

        //Invoice firstBuy = new Invoice(1, firstCustomer, 30);
        //System.out.println(firstBuy.getAmount());
        //System.out.println(firstBuy.getAmountAfterDiscount());


        //System.out.println("Customer with id " + firstBuy.getCustomerId() +" named " + firstBuy.getCustomerName() + " that has a discount of " + firstBuy.getCustomerDiscount()+"% is buying a product of value " + firstBuy.getAmount() + " and after discount is paying "+ firstBuy.getAmountAfterDiscount());

    }
}