import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PLotReader {
    public static void main(String[] args) throws IOException {
        readFile("plaintext.log");

    }
    public static void readFile(String filename) throws IOException {
        byte[] buffer = new byte[1024];

        File file = new File(filename);
        FileInputStream in = new FileInputStream(file);
        long size = file.length();

        while(size > 0) {
            int len = in.read(buffer);
            size -= len;

            System.out.println(new String(buffer, 0, len));
        }
    }
}
