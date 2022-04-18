package Data_Types;

/**
 * The char type is used for describe individual characters, but some Unicode charachters can be described with one char
 * character value, and other Unicode charaters required two char.
 *
 * You can use exadecimal values to express values of type char.
 *
 */

public class CharType {
    public static void main(String[] args) {

        // It's printing (tm) Trademark Simbol
        char letter1 = '\u2122';

        System.out.println(letter1);

    }
}
