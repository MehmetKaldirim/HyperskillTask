package string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class convertDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse(new Scanner(System.in).nextLine());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
        System.out.println(formatter.format(date));
    }
}

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] datum = date.split("-");
        System.out.println(datum[1] + "/" + datum[2] + "/" + datum[0]);
        //System.out.println(String.join("/", datum[1], datum[2], datum[0]));



Write a program that takes a date string formatted as YYYY-MM-DD as input,
then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.*/