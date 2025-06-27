import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        char[] userDefined = getCharacters(str);
        char[] builtIn = str.toCharArray();

        System.out.print("User-defined method: ");
        for (char c : userDefined) System.out.print(c + " ");
        System.out.print("\ntoCharArray(): ");
        for (char c : builtIn) System.out.print(c + " ");
        System.out.println("\nArrays match: " + compareCharArrays(userDefined, builtIn));

        scanner.close();
    }
}