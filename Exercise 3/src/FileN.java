import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Dette program tæller og printer antallet af ord i en givne fil.
public class FileN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Exercise 3/src/Example"));
        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            count++;
        }
        System.out.println("The total words are: " + count);
    }
}
