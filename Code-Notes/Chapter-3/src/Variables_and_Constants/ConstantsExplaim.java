package Variables_and_Constants;

/**
 * In Java use the keyword final to denote a constant.
 * The keyword final indicates that you can assign to the variable once, and then its value is set once and for all.
 *
 */

public class ConstantsExplaim {

    /**
     * We can create a constant class, outside of he main class, and we'll have access to multiple methods inside
     * a single class.
     *
     */
    public static final double HACKER_KEY = 666;

    public static void main(String[] args) {

        final int ACCOUNT_CODE = 1234;

        // Evoking the static class outside the main above.
        System.out.println(HACKER_KEY);

    }
}
