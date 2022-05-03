package Strings;

public class StringsExamples {
    public static void main(String[] args) {

        // Substring method for extract a substring
        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);

        // Concatenation
        String cheers = "Hello! how are you Mrs.";
        String name = "George";
        String message = cheers + name;
        System.out.println(message + "\n");

        // Java 11 repeat method
        String repeated = "George\n".repeat(3);
        System.out.println("This is the repeat method in Java 11:\n" + repeated + "\n");

        /**
         * Strings in Java are immutables, you can't directily change the last positions of a String, for this in Java
         * we do a concatenate the substring that you want to keep the caracters that you want to replace.
         */
        String order = "Get out Here";
        String order2 = "Get out Here";

        System.out.println("order before concatenate substring: " + order);
        order = order.substring(8, 12) + " Stay";
        System.out.println("order after concatenate substring: " + order + "\n" );

        System.out.println("order2 before concatenate substring: " + order2);
        order2 = order2.substring(0, 3) + " in Here";
        System.out.println("order2 after concatenate substring: " + order2 + "\n");


        /**
         * Testing Strings for equality
         * Don't use the == operator to test wheter two strings are equal.
         */
        String name1 = "George";
        String name2 = "Alan";
        String name3 = "Alan";

        var testingStrings = name1.equals(name2);
        System.out.println("Testing if strings name1 and name2 are equals: " + testingStrings);

        var testingStrings2 = name2.equals(name3);
        System.out.println("Testing if strings name2 and name3 are equals: " + testingStrings2);

        System.out.println("Fabricio".equals(name1));
        System.out.println("Today".equalsIgnoreCase("today") + "\n");

        /**
         * Empty and Null Strings
         * The empty String is a String of lenght 0.
         *
         */

        // Testing if a String is empty or nullbota desses lugares
        String str = "";

        if (str.length() == 0){
            System.out.println("The string is empty method 1");
        }
        //or
        if (str.equals("")){
            System.out.println("The string is empty method 2");
        }

        // Testing if String are null
        if (str == null){
            System.out.println("This String is null");
        }

        // Testing if a String is not null and empty at same time
        if (str != null && str.length() == 0){
            System.out.println("Both that strings aren't null nor empty" + "\n");
        }


        /**
         * Code Points and Code Units
         */

        // Get the true lenght, the number of code points
        String verdadeiroTamanhoDaPalavra = "Jabuticabeira";
        int cpCount = verdadeiroTamanhoDaPalavra.codePointCount(0, verdadeiroTamanhoDaPalavra.length());
        System.out.println("Esse é o verdadeiro tamanho da palavra contina na variável cpCount: " + cpCount + "\n");

        // Get code unit at position n where n is between 0 and s.lenght()
        char firstLetter = verdadeiroTamanhoDaPalavra.charAt(0);
        char lastLetter = verdadeiroTamanhoDaPalavra.charAt(12);
        System.out.println("A primeira letra da variável é: " + firstLetter + "\n A segunda letra da variável é: " + lastLetter + "\n");

        // Get by ith code point
        String capturarNumeroIndice = "Seiya";
        int index = capturarNumeroIndice.offsetByCodePoints(0, 1);
        int codePoint = capturarNumeroIndice.codePointAt(index);
        System.out.println("Capturamos o indice: " + codePoint + " da String.\n");

        // Return the number of Unicode points in the specified text range
        codePoint = capturarNumeroIndice.offsetByCodePoints(0, 2);
        System.out.println("Capturamos o range: " + codePoint + "\n");

    }
}
