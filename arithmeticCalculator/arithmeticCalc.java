package arithmeticCalculator;

import java.util.Scanner;

class arithmeticCalc {
  public static void main(String[] args) {

    char op;
    Double n1, n2, res;

    
    Scanner in = new Scanner(System.in);


    System.out.println("Choose an operator: +, -, *, or /");
    op = in.next().charAt(0);

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
        System.out.println("Error:Invalid Operation has been performed");
        break;
    }

    in.close();
  }
}
