package Data_Types;

/**
 * The boolean type have two values, true or false. It's is used for valuate logical conditions.
 * You cannot convert between integers and boolean values.
 */

public class BooleanType {
    public static void main(String[] args) {

        boolean trueValue = true;
        boolean falseValue = false;

        int x = 1;
        int y = 2;

        boolean testEqualValue = x == y;
        boolean testDifferentValue = x != y;

        System.out.println(trueValue);
        System.out.println(falseValue);

        System.out.println(testEqualValue);
        System.out.println(testDifferentValue);

    }
}
