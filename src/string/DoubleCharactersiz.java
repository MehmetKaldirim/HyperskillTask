package string;

import java.util.Scanner;

public class DoubleCharactersiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String doubleStr = "";
        for (char c : str.toCharArray()) {
            doubleStr = doubleStr + c + c;
        }
        System.out.println(doubleStr);
    }
}
