package arithmeticCalculator;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char op;
    Double n1, n2, res;

    // create an object of Scanner class
    Scanner in = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    op = in.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    n1 = in.nextDouble();

    System.out.println("Enter second number");
    n2 = in.nextDouble();

    switch (op) {

   
      case '+':
        res = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + res);

      
      case '-':
        res = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + res);
        break;

     
      case '*':
        res = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + res);
        break;


      case '/':
        res = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + res);
        break;

      default:
        System.out.println("Invalid operation");
        break;
    }

    in.close();
  }
}