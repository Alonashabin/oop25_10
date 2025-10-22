package oop25_10;



import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String oldInput;
        do {
            System.out.print("Enter the character to replace (single character): ");
            oldInput = sc.nextLine();
        } while (oldInput.length() == 0);

        char oldChar = oldInput.charAt(0);

        String newInput;
        do {
            System.out.print("Enter the new character (single character): ");
            newInput = sc.nextLine();
        } while (newInput.length() == 0);

        char newChar = newInput.charAt(0);

        // Ask user if they want case-insensitive replacement
        boolean caseInsensitive = false;
        System.out.print("Replace case-insensitive? (y/N): ");
        String ci = sc.nextLine().trim();
        if (!ci.isEmpty() && (ci.equalsIgnoreCase("y") || ci.equalsIgnoreCase("yes"))) {
            caseInsensitive = true;
        }

        StringBuilder result = new StringBuilder(input.length());

        if (caseInsensitive) {
            char oldLower = Character.toLowerCase(oldChar);
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.toLowerCase(c) == oldLower) {
                    result.append(newChar);
                } else {
                    result.append(c);
                }
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == oldChar) {
                    result.append(newChar);
                } else {
                    result.append(c);
                }
            }
        }

        System.out.println("Modified string: " + result.toString());
        sc.close();
    }
}
