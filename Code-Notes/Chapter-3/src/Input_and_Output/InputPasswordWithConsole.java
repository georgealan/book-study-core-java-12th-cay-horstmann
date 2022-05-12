package Input_and_Output;

import java.io.Console;

/**
 * Note: System.console() returns null in an online IDE
 * The Scanner class is not suitable for rading passwords from a console, for this purpose use the Console class
 */

public class InputPasswordWithConsole {
    public static void main(String[] args) {
        String str;
        Console con = System.console();

        if(con == null)
        {
            System.out.print("No console available");
            return;
        }

        // Read a string and then display it.
        str = con.readLine("Enter your name: ");
        con.printf("Here is your name: %s\n", str);

        //to read password and then display it
        System.out.println("Enter the password: ");
        char[] ch=con.readPassword();

        //converting char array into string
        String pass = String.valueOf(ch);
        System.out.println("Password is: " + pass);
    }
}
