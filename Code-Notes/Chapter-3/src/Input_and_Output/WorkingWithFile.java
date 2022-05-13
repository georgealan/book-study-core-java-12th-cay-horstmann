package Input_and_Output;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class WorkingWithFile {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(Path.of("src/files/readme.txt"), StandardCharsets.UTF_8);
        in.useDelimiter("\n");
        while (in.hasNext()) {
            System.out.println(in.next());
        }

    }
}
