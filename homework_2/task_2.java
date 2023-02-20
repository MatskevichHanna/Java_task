package homework_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
public class task_2 {
    public static void main(String[] args) {
        createNewFile("file.txt");
    }

    private static void createNewFile(String fileName) {
        Path file = Path.of(fileName);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        String resulString = sb.toString();

        try {
            if (Files.exists(file)) {
                Files.writeString(file, resulString);
            } else {
                Files.createFile(file);
                Files.writeString(file, resulString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}