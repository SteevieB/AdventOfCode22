import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IOReaderWriter {
    public ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> buffer = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(buffer::add);
        }
        return buffer;
    }

    public void appendToFile(String fileName, String data) {
        try (FileWriter fw = new FileWriter(fileName, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void appendToFile(String fileName, ArrayList<String> data) {
        for (String line : data) appendToFile(fileName, line);
    }

    public void deleteFile(String filename) {
        File f2del = new File(filename);
        if (f2del.delete()) {
            System.out.println(filename + " deleted.");
        } else {
            System.out.println(filename + " not found.");
        }
    }
}
