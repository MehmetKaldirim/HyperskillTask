package string;

import java.util.Arrays;

public class DoubleCharacters {
    public static void main(String[] args) {
        String[]  str = new java.util.Scanner(System.in).next().split("");
        // List<String> list = new ArrayList<>(List.of(scanner.next().split("")));
        String str1 = new java.util.Scanner(System.in).next();
        for (char c : str1.toCharArray()) {
            System.out.print(""+c+c);
        }

        for (String s : str) {
            System.out.print(s+s);
        }

    }
}
