import java.util.Scanner;

public class LowercaseConversion {
    public static String toLowerCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
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

        String customLower = toLowerCaseCustom(str);
        String builtInLower = str.toLowerCase();

        System.out.println("Using custom method: " + customLower);
        System.out.println("Using toLowerCase(): " + builtInLower);
        System.out.println("Strings match: " + compareStrings(customLower, builtInLower));

        scanner.close();
    }
}