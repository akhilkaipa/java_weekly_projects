import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();


        String concat1 = str1.concat(str2);
        String concat2 = str2.concat(str1);


        System.out.println("Concatenation 1 (str1 + str2): " + concat1);
        System.out.println("Concatenation 2 (str2 + str1): " + concat2);


        if (concat1.equals(concat2)) {
            System.out.println("The concatenated strings are equal.");
        } else {
            System.out.println("The concatenated strings are not equal.");
        }


        boolean isAlternating = isAlternatingPattern(str1, str2, concat1);
        System.out.println("Is the composition alternating? " + isAlternating);

        scanner.close();
    }


    private static boolean isAlternatingPattern(String str1, String str2, String combined) {
        int len1 = str1.length();
        int len2 = str2.length();
        int totalLen = combined.length();


        for (int i = 0; i < totalLen; i++) {
            if (i % 2 == 0 && i / 2 < len1 && combined.charAt(i) != str1.charAt(i / 2)) {
                return false;
            }
            if (i % 2 == 1 && i / 2 < len2 && combined.charAt(i) != str2.charAt(i / 2)) {
                return false;
            }
        }
        return true;
    }
}
