package Scanner;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the coordinates:");
        String coordinat = scan.nextLine();

        coordinat = coordinat.replaceAll(" ", "");


        if (coordinat.length() < 2) {
            System.out.println("You should enter two numbers!");
            System.out.print("Enter the coordinates again:");
            coordinat = scan.nextLine();
            coordinat = coordinat.replaceAll(" ", "");
        } else if (coordinat.charAt(0) < '0' || coordinat.charAt(0) > '9' ||
                coordinat.charAt(1) < '0' || coordinat.charAt(1) > '9') {
            System.out.println("You should enter numbers!");
            System.out.print("Enter the coordinates again:");
            coordinat = scan.nextLine();
            coordinat = coordinat.replaceAll(" ", "");

        } else if (coordinat.charAt(0) - 48 > 3 || coordinat.charAt(0) - 48 < 1 ||
                coordinat.charAt(1) - 48 > 3 || coordinat.charAt(1) - 48 < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            System.out.print("Enter the coordinates again:");
            coordinat = scan.nextLine();
            coordinat = coordinat.replaceAll(" ", "");
        }
        int number1 = coordinat.charAt(0) - 48;
        int number2 = coordinat.charAt(1) - 48;

        System.out.println("Number 1 = " + number1 +"Number 2 = " + number2 );
    scan.close();
    }
}
