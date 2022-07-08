import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator (+, -, *, or /): ");
    operator = input.next().charAt(0);

    switch (operator) {
      case '+':
        System.out.println("\nEnter first number: ");
        number1 = input.nextDouble();

        System.out.println("\nEnter second number: ");
        number2 = input.nextDouble();

        result = number1 + number2;
        System.out.println("\n" + number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        System.out.println("\nEnter first number: ");
        number1 = input.nextDouble();

        System.out.println("\nEnter second number: ");
        number2 = input.nextDouble();

        result = number1 - number2;
        System.out.println("\n" + number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        System.out.println("\nEnter first number: ");
        number1 = input.nextDouble();

        System.out.println("\nEnter second number: ");
        number2 = input.nextDouble();

        result = number1 * number2;
        System.out.println("\n" + number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        System.out.println("\nEnter first number: ");
        number1 = input.nextDouble();

        System.out.println("\nEnter second number: ");
        number2 = input.nextDouble();

        result = number1 / number2;
        System.out.println("\n" + number1 + " / " + number2 + " = " + result);
        break;   

      default:
        System.out.println("\nInvalid input.");
        break;       
    }
    input.close(); 
  }
}
