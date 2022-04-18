package Data_Types;

import java.util.Arrays;
import static java.lang.Math.sqrt;

/**
 * The floating-point numbers are numbers with fractional parts, they're 2 types: float and double.
 *
 * Numbers of type float have a suffix F or f example: 3.14F, Flaating numbers without a suffix such as 3.14 will be
 * considered of type double. Optionaly you can supply the D or d suffix, example: 3.14D.
 *
 *  Floting-point numbers are nor suitable for financial calculations, in wich roundoff errors cannot be tolerated, if
 *  need precise numerical computations use the BigDecimal class.
 */

public class FloatingPointTypes {
    public static void main(String[] args) {

        float ammountInCash; // 4 bytes, over 3.40282347x10^38 (6-7 decimal digits)
        float ammountInCash2;
        double ammountInCashRichGuy; // 8 bytes, over 1.79769313486231570x10^308 (15 decimal digits)
        double ammountInCashRichGuy2;
        double ammountInCashRichGuy3;
        double ammountInCashRichGuy4;

        double testIEEE754Specification = 0;

        ammountInCash = 1.234F;
        ammountInCash += 1.234;
        ammountInCash2 = 1234;
        ammountInCashRichGuy = 1.234;
        ammountInCashRichGuy2 = 1.234E2;
        ammountInCashRichGuy3 = 1.234E3;
        ammountInCashRichGuy4 = 1.234E4;

        System.out.println(ammountInCash);
        System.out.println(ammountInCash2);
        System.out.println(ammountInCashRichGuy);
        System.out.println(ammountInCashRichGuy2);
        System.out.println(ammountInCashRichGuy3);
        System.out.println(ammountInCashRichGuy4);

        // result NaN
        System.out.println(testIEEE754Specification / 0);

        // result NaN
        System.out.println(sqrt(-90) / testIEEE754Specification);

        // Result positive Infinity
        System.out.println(90 / testIEEE754Specification);

        // Result negative Infinity
        System.out.println(-90 / testIEEE754Specification);

    }
}
