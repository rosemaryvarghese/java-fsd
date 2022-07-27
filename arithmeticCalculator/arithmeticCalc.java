package arithmeticCalculator;
import java.util.Scanner;

public class arithmeticCalc{
  public static void main(String[] args) {

    char op;
    Double n1, n2, res;

   
    Scanner s = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    op = s.next().charAt(0);

    System.out.println("Enter first number");
    n1 = s.nextDouble();

    System.out.println("Enter second number");
    n2 = s.nextDouble();

    switch (op) {

 
      case '+':
        res = n1 + n2;
        System.out.println("SUM: "+n1 + " + " + n2 + " = " + res);
        break;

      case '-':
        res = n1 - n2;
        System.out.println("Difference:"+n1 + " - " + n2 + " = " + res);
        break;

      case '*':
        res = n1 * n2;
        System.out.println("Product:"+n1 + " * " + n2 + " = " + res);
        break;

      case '/':
        res = n1 / n2;
        System.out.println("Quotient:"+n1 + " / " + n2 + " = " + res);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    s.close();
  }
}
