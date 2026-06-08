package methods;

import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MiniCalculator object = new MiniCalculator();

        System.out.println("Choose Options");
        System.out.println("Choose One -> Add");
        System.out.println("Choose Two -> Subtract");
        System.out.println("Choose Three -> Divide");
        System.out.println("Choose Four -> Multiply");
        System.out.println("Choose Five -> Remainder");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        double numberOne = input.nextDouble();

        System.out.print("Enter second number: ");
        double numberTwo = input.nextDouble();

        switch (choice) {

            case 1:
                add(numberOne, numberTwo);
                break;

            case 2:
                object.subtract(numberOne, numberTwo);
                break;

            case 3:
                System.out.println(divide(numberOne, numberTwo));
                break;

            case 4:
                object.multiply(numberOne, numberTwo);
                break;

            case 5:
                System.out.println(object.remainder(numberOne, numberTwo));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }

    public static void add(double numberOne, double numberTwo) {

        double result = numberOne + numberTwo;

        System.out.println("This is add value = " + result);
    }

    public void subtract(double numberOne, double numberTwo) {

        double result = numberOne - numberTwo;

        System.out.println("This is subtract value = " + result);
    }

    public static String divide(double numberOne, double numberTwo) {

        if (numberTwo == 0) {
            return "Cannot divide by zero!";
        }

        double result = numberOne / numberTwo;

        return "This is divide value = " + result;
    }

    public void multiply(double numberOne, double numberTwo) {

        double result = numberOne * numberTwo;

        System.out.println("This is multiply value = " + result);
    }

    public String remainder(double numberOne, double numberTwo) {

        if (numberTwo == 0) {
            return "Cannot find remainder with zero!";
        }

        double result = numberOne % numberTwo;

        return "This is remainder value = " + result;
    }

    public static void showProgramName() {

        System.out.println("Mini Calculator Program");
    }
}