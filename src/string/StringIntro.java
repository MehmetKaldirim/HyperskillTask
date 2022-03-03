package string;

import java.util.Arrays;

public class StringIntro {
    public static void main(String[] args) {


        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

        String stringFromChars = String.valueOf(chars); // "ABCDEF"

        System.out.println("stringFromChars = " + stringFromChars);

        char[] charsFromString = stringFromChars.toCharArray();
            // { 'A', 'B', 'C', 'D', 'E', 'F' }
        System.out.println(Arrays.toString(charsFromString));

        String theSameString = new String(charsFromString); // "ABCDEF"

        System.out.println("----------------------------");
        String text = "Hello";
        String[] parts = text.split(""); // [H, e, l, l, o]
        System.out.println(Arrays.toString(parts));

        String number = "+1-213-345-6789";
        String[] newNum = number.split("-"); // [+1, 213, 345, 6789]
        System.out.println(Arrays.toString(newNum));

    }
}
