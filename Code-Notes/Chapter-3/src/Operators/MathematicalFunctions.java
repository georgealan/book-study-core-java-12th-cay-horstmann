package Operators;

import static java.lang.Math.*;

/**
 * The Math class a lot of mathematical functions.
 *
 * The methods in the Math class use the routines in computer's floating-point unit for fatest performance. If
 * predictable results are more important than performcnce, use the StrictMath class instead.
 */

public class MathematicalFunctions {
    public static void main(String[] args) {

        // This means 4^2, wich result 16.0
        double numberPow = pow(4, 2);

        int position = 0;
        int adjustment = 21;
        int adjustmentNegative = -21;

        // round floating-point value with Math.round()
        double x = 9.997;
        int nx = (int) round(x);

        System.out.println("The square root of \u03c0 is: " + sqrt(PI));
        System.out.println(numberPow);

        // Solving position hour hand of a clock with method floorMod
        System.out.println(floorMod(position + adjustment, 12));
        // Same but with other approach, but have a little trouble with negative numbers
        System.out.println((position + adjustment) % 12);
        // See with negative numbers
        System.out.println((position + adjustmentNegative) % 12);
        // For solve this trouble introduce a branch, but it is hassle, and floorMod resolve this more ease.
        System.out.println(((position + adjustmentNegative) % 12 + 12) % 12);

        System.out.println(nx);
    }
}
