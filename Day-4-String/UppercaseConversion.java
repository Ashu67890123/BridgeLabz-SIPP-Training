import java.util.Scanner;

public class UppercaseConversion {
    public static String toUpperCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
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

        String customUpper = toUpperCaseCustom(str);
        String builtInUpper = str.toUpperCase();

        System.out.println("Using custom method: " + customUpper);
        System.out.println("Using toUpperCase(): " + builtInUpper);
        System.out.println("Strings match: " + compareStrings(customUpper, builtInUpper));

        scanner.close();
    }
}