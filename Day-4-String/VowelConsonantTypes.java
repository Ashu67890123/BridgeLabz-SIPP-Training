import java.util.Scanner;

public class VowelConsonantTypes {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] getCharTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharType(str.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        System.out.println("-----------------");
        for (String[] row : table) {
            System.out.printf("%s\t\t%s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[][] charTypes = getCharTypes(str);
        displayTable(charTypes);

        scanner.close();
    }
}