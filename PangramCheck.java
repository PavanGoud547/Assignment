
import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        
        boolean isPangram = checkIfPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean checkIfPangram(String sentence) {
        boolean[] alphabetPresent = new boolean[26]; // Assuming English alphabet
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                alphabetPresent[index] = true;
            }
        }

        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }
}
