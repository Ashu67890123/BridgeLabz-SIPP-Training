import java.util.Scanner;

public class StringTrim {
    public static int[] trimIndices(String str) {
        int start = 0, end = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i + 1;
                break;
            }
        }
        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] indices = trimIndices(str);
        String customTrim = createSubstring(str, indices[0], indices[1]);
        String builtInTrim = str.trim();

        System.out.println("Custom trim: " + customTrim);
        System.out.println("Built-in trim: " + builtInTrim);
        System.out.println("Strings match: " + compareStrings(customTrim, builtInTrim));

        scanner.close();
    }
}