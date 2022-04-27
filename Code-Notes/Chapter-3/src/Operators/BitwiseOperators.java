package Operators;

/**
 * For any of the integer types, you have operators that can work directly with the bits that make up the integers.
 * This means that you can use masking techniques to get a individual bits in a number.
 *
 * &("and") |("or") ^("xor") ~("not")
 *
 * Shift operators are: << >> >>>
 *      The << moves all bits by a given number of this bits to the left.
 *      The >> moves all bits by a given number of this bits to the right.
 *      The >>> it's the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the sign bit.
 */

public class BitwiseOperators {
    public static void main(String[] args) {

        int n = 28; // 28 in binary representation is: 011100
        //int n = 20; // 28 in binary representation is: 010100
        int x = 2;
        int y = 8;

        int fourthBitFromRight = (n & 0b1000) / 0b1000; // 0b1000 is = 0 in decimal

        /**
         * In the example above, the binary number 0010 (in decimal 2) becomes 1000 after shifting the bits to the left (in decimal 8).
         */
        int shiftedNumberLeft = x << 2;

        /**
         * In the example above, the binary number 1000 (in decimal 8) becomes 0010 after shifting the bits to the right (in decimal 2).
         */
        int shiftedNumberRight = y >> 2;

        System.out.println(fourthBitFromRight);
        System.out.println(shiftedNumberLeft);
        System.out.println(shiftedNumberRight);

    }
}
