import java.io.*;
import java.util.*;

public class OnebyOne {
    public static void main(String args[]) {
        try {
            int i;
            Reader r = new FileReader("d:/raw.txt");
            int c;
            while ((c = r.read()) != -1) {
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    System.out.print((char) c);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}