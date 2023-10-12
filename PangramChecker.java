import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PangramChecker {

    public static boolean isPangram(String s) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : s.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
