package Strings;

public class UsefullMethodsStringApi {

    public static void main(String[] args) {

        String textExample1 = "Pedro Alvarez Cabral";
        String textExample2 = "Im a Java programmer with a lot of knowledge";
        String textEqualButNotIgnoreCase1 = "Pineapple";
        String textEqualButNotIgnoreCase2 = "pineapple";
        String textEqualAndIgnoreCase = "Pineapple";
        String emptyText = "";
        String notEmptyText = "Here has a text written";
        String blankText = " ";
        String notBlankText = "Here has a text written";

        // compareTo() method
        int compareWithOther1 = textEqualAndIgnoreCase.compareTo(textEqualButNotIgnoreCase1);
        int compareWithOther2 = textEqualAndIgnoreCase.compareTo(textEqualButNotIgnoreCase2);
        int compareWithOther3 = textEqualButNotIgnoreCase1.compareToIgnoreCase(textEqualButNotIgnoreCase2);
        System.out.println("If resuts of method compareTo is = " + compareWithOther1 + " Them the Strings are equals");
        System.out.println("If resuts of method compareTo is = " + compareWithOther2 + " Them the Strings aren't equals");
        System.out.println("If resuts of method compareTo is = " + compareWithOther3 + " Them the Strings are equals even " +
                "if strings aren't equals in case letters \n");

        // isEmpty() method
        boolean checkIfStringIsEmpty = emptyText.isEmpty();
        System.out.println("If a string is empty the method isEmpty() should return = " + checkIfStringIsEmpty);

        checkIfStringIsEmpty = notEmptyText.isEmpty();
        System.out.println("If a string isn't empty the method isEmpty() should return = " + checkIfStringIsEmpty);

        boolean checkIfStringIsBlank = blankText.isBlank();
        System.out.println("If a string is blank the method isBlank() should return = " + checkIfStringIsBlank);

        checkIfStringIsBlank = notBlankText.isBlank();
        System.out.println("If a string isn't blank the method isBlank() should return = " + checkIfStringIsBlank + "\n");

        // startsWith() and endsWith() methods
        boolean textShouldStartWithCorrectPrefix = textExample1.startsWith("P");
        System.out.println("If this String init with a prefix P, the result will be: " + textShouldStartWithCorrectPrefix);

        textShouldStartWithCorrectPrefix = textExample1.startsWith("S");
        System.out.println("If this String don't init with a correct prefix P, the result will be: " + textShouldStartWithCorrectPrefix);

        boolean textShouldEndWithCorrectSuffix = textExample2.endsWith("e");
        System.out.println("If this String ends with a correct suffix e, them result will be: " + textShouldEndWithCorrectSuffix);

        textShouldEndWithCorrectSuffix = textExample2.endsWith("l");
        System.out.println("If this String don't ends with a correct suffix e, them result will be: " + textShouldEndWithCorrectSuffix);


    }

}
