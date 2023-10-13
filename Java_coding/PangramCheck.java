
import java.util.*;

public class PangramCheck {
    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        String lowercaseSentence = sentence.toLowerCase(); // Convert to lowercase for case insensitivity

        for (char c : lowercaseSentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26; // Check if all 26 letters of the alphabet are present
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        boolean isPangram = isPangram(inputSentence);

        if (isPangram) {
            System.out.println("The input sentence is a pangram.");
        } else {
            System.out.println("The input sentence is not a pangram.");
        }

        scanner.close();
    }
}
