package oop25_10;



import java.util.*;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Character result = findFirstNonRepeatingCharacter(input);

        
        if (result == null) {
            System.out.println("None");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        sc.close();
    }

    public static Character findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
