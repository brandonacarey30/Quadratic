// Brandon Carey
// CSC 111
// August 30 2013
// This program prompts a user to enter the coefficients needed to 
// complete the Quadratic Equation.

import java.util.Scanner;

public class Quadratic
{
  public static void main(String[] args)
  {
    double x = 0;
    double z = 0; 
    double y = 0; 
    Scanner quad = new Scanner(System.in);

    System.out.println("This program solves the quadratic equation: "
                     + "ax^2 + bx + c = 0. Please enter your 'A' coefficient.");
    double a = quad.nextDouble();
    System.out.println(a);

    System.out.println("Please enter your 'B' coefficient.");
    double b = quad.nextDouble();
    System.out.println(b);

    System.out.println("Please enter your 'C' coefficient.");
    double c = quad.nextDouble();
    System.out.println(c);

    x = (-b + (Math.sqrt((b*b - ((4*a*c)))))) / (2 * a);
    z = (-b - (Math.sqrt((b*b - ((4*a*c)))))) / (2 * a); 
    y = ((-b / (2 * a)));

    if (((b*b - ((4*a*c))) < 0)) {
    System.out.println("I am sorry, but there are no real roots.");
    }

    else if (((b*b - ((4*a*c))) > 0)) {
    System.out.println("Nice! The roots are: " + x + " and " + z + ".");
    }

    else {
    System.out.println("There is a double root: " + y);
    }
  }
}

