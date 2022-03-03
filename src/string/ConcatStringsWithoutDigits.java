package string;

import java.util.Scanner;

public class ConcatStringsWithoutDigits {
    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            word.append(strings[i].replaceAll("\\d", "") );//.replaceAll("\\s", "")
            //word.append(str.replaceAll("[0-9]+", ""));
        }

        /*if (Character.isAlphabetic(string.charAt(i))) {
            sb.append(string.charAt(i));
        }*/

        return word.toString();
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] strings = scanner.nextLine().split("\\s+");
    String result = concatenateStringsWithoutDigits(strings);
    System.out.println(result);
}
}

//Implement a method to concatenate all strings from the given array to a single long string.
// You must skip all digits inside the input strings.
//
//Use StringBuilder to solve the problem, because the input array can contain
// a huge number of strings.