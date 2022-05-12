package Input_and_Output;

import java.io.Console;
import java.util.Calendar;
import java.util.Scanner;

public class InputExample1 {
    static Calendar actualSystemDate = Calendar.getInstance();
    static int actualMonth = actualSystemDate.get(Calendar.MONTH);
    static int actualYear = actualSystemDate.get(Calendar.YEAR);
    static int actualDay = actualSystemDate.get(Calendar.DAY_OF_MONTH);
    public static String getAgeOfPerson(String name, int day, int month, int year) {
        int personAge = 0;
        String message = null;

        if (month == actualMonth && day < actualDay){
            personAge = actualYear - year - 1;
            message = "Hello " + name + " you age currently is: " + personAge;
            System.out.println(message);
        } else if (month > actualMonth) {
            personAge = actualYear - year - 1;
            message = "Hello " + name + " you age currently is: " + personAge;
            System.out.println(message);
        } else if ( month <= actualMonth ) {
            personAge = actualYear - year;
            message = "Hello " + name + " you age currently is: " + personAge;
            System.out.println(message);
        }

        return message;
    }

    public static void main(String[] args) {

        Scanner inputInformations = new Scanner(System.in);

        System.out.println("Olá qual o seu nome?");
        String personName = inputInformations.nextLine();

        System.out.println("Qual o dia do seu nascimento?");
        int dayOfBirth = inputInformations.nextInt();

        System.out.println("Qual o mês do seu nascimento?");
        int monthOfBirth = inputInformations.nextInt();

        System.out.println("Qual o ano do seu nascimento?");
        int yearOfBirth = inputInformations.nextInt();

        getAgeOfPerson(personName, dayOfBirth, monthOfBirth, yearOfBirth);

    }
}
