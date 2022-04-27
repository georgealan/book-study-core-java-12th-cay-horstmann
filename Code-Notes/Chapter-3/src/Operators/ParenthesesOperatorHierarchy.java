package Operators;

public class ParenthesesOperatorHierarchy {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 10;

        // This sum have this precedence: a += (b += c)
        int summation = a += b += c;

        if (a < 1 && b < 1 || c > 5 ){
            // Here the precedence is ( a < 1 && b < 1 ) || c < 1. The && have more precedence than ||
            System.out.println("This result is c in this statement");
        }

        if (a > 1 && b > 1 || c > 5 ){
            // Here the precedence is ( a < 1 && b < 1 ) || c < 1. The && have more precedence than ||
            System.out.println("This result is a && b in this statement");
        }

        if (a > 50 && b > 50 || c < 1 ){
            // Here the precedence is ( a < 1 && b < 1 ) || c < 1. The && have more precedence than ||
            System.out.println("This result won't printed");
        }

        int test = a << 1;

        System.out.println(test);

    }
}
