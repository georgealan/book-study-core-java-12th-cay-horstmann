package Strings;

/**
 * StringBuilder is situable for build up strings from shorter strings, such as keystrokes or words from a file.
 * Is inefficient use string concatenation from this purpose, every time you concatenate a string, a new String
 * Object is constructed, this is time consuming and wastes memory, using StringBuilder class avoid that problem.
 *
 * StringBuilder is not safe for use by multiple threads, for that is more suitable StringBuffer to be used.
 */

public class BuildingStrings {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append('G');
        builder.append("Alerta");
        builder.append("Meiday");
        builder.append("Meiday");
        builder.append("Meiday");

        String completedString = builder.toString();
        System.out.println(completedString);

        // Add string to builder in determined index.
        builder.insert(1, "eorge");
        completedString = builder.toString();
        System.out.println(completedString);

        // delete characteres in a detemined range of index.
        builder.delete(18, 30);
        completedString = builder.toString();
        System.out.println(completedString);

        // Reverse character sequence
        builder.reverse();
        completedString = builder.toString();
        System.out.println(completedString);

    }
}
