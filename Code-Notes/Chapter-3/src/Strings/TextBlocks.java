package Strings;

/**
 * Text blocks is a feature add in Java 15, it makes easy to provide string literals that span multiple lines.
 * Text blocks are particulary suited for including code in some other languages, such as SQL or HTML.
 */

public class TextBlocks {
    public static void main(String[] args) {

        /** We have to use the character escape \ if we want the text in one line sequence.
         *  If you don't use \ the block of text will be the same as you see.
         */
        String blockOfLongTextInOneLine = """
            Here in my yard have a lot of butterflies floating \
            in the fresh breeze, it's gorgeous,I lost time and \
            dont't take a shot with my cam. \
            Sorry for that mistake! \n""";

        String blockOfLongTextTheSameAsView = """
            Here in my yard have a lot of butterflies floating
            in the fresh breeze, it's gorgeous,I lost time and
            dont't take a shot with my cam.
            Sorry for that mistake!""";

        System.out.println(blockOfLongTextInOneLine);
        System.out.println(blockOfLongTextTheSameAsView);
    }
}
