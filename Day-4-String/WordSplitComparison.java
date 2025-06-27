import java.util.Scanner;
import java.util.ArrayList;

public class WordSplitComparison {
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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] customWords = splitWords(str);
        String[] builtInWords = str.split("\\s+");

        System.out.println("Custom split:");
        for (String word : customWords) System.out.println(word);
        System.out.println("Built-in split:");
        for (String word : builtInWords) System.out.println(word);
        System.out.println("Arrays match: " + compareArrays(customWords, builtInWords));

        scanner.close();
    }
}