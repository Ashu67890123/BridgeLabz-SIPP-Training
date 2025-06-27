import java.util.Scanner;
import java.util.ArrayList;

public class WordLengthArray {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String str) {
        ArrayList<Integer> spaceIndices = new ArrayList<>();
        spaceIndices.add(-1);
        for (int i = 0; i < getLength(str); i++) {
            if (str.charAt(i) == ' ') {
                spaceIndices.add(i);
            }
        }
        spaceIndices.add(getLength(str));

        String[] words = new String[spaceIndices.size() - 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndices.get(i) + 1;
            int end = spaceIndices.get(i + 1);
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
        }
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = splitWords(str);
        String[][] wordLengths = getWordLengths(words);

        System.out.println("Word\tLength");
        System.out.println("---------------");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%s\t%d%n", wordLength[0], Integer.parseInt(wordLength[1]));
        }

        scanner.close();
    }
}