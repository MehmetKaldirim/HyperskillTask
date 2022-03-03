package string;

import java.util.Scanner;

public class TheLuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        boolean isEqual = str.charAt(0) + str.charAt(1) +str.charAt(2) ==
                str.charAt(length-1) + str.charAt(length-2) +str.charAt(length-3);
        System.out.println(isEqual ? "Lucky" : "Regular" );
        /* another solution
         String[] array = scanner.nextLine().split("");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += Integer.parseInt(array[i]);
            sum2 += Integer.parseInt(array[i + array.length / 2]);
        }
        System.out.println(sum1 == sum2 ? "Lucky" : "Regular");
         */

    }
}
/*Paul loves to ride public transport and after receiving a ticket, he immediately checks
whether he got a lucky one. A ticket is considered a lucky one if the sum of the first three
numbers of this ticket matches the sum of the last three numbers.

However, Paul does not count well in his head. That is why he asks you to write a program
which will check the equality of the sums and display "Lucky" if the sums match, and "Regular"
 if the sums differ.

A string of six digits is provided as input to the program.

You need to print out only the word "Lucky" or "Regular" with a capital
letter (without quotes).*/