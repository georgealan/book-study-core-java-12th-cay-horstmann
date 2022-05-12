package Input_and_Output;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FormatingOutput {
    public static void main(String[] args) {

        // Print salary with a field of 8 characters and precision of 2 characters.
        double salary = 1503.0 / 3.0;
        double moreSalary = 10000.0 / 3.0;
        System.out.printf("%8.2f \n", salary);
        System.out.printf("%8.2f \n", moreSalary);
        System.out.printf("%,.2f \n", moreSalary);

        // Supplying parameters
        String name = "George";
        int age = 34;
        System.out.printf("Hello, %s. Next year you'll be %d, year old. \n", name, age);
        String message = "Hello, %s. Next year you'll be %d, year old.".formatted(name, age + 1);
        System.out.println(message);

        // Exponential floating-point
        double account = 3333.33;
        System.out.printf("%8.2E \n", account);

        // Closing negative numbers
        double negativePrice = 15 - 89;
        System.out.printf("%,(.2f", negativePrice);

    }
}
