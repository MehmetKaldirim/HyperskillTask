package string;

import java.util.Scanner;

public class HighestFrequencyEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = " " + str + " ";
        int countOfCh;
        int max = 0;
        String result="";
        for (int i = 0; i <str.length() ; i++) {
           String ch = str.charAt(i)+"";
           countOfCh = str.split(ch).length - 1;
           if (countOfCh > max){
               max = countOfCh;
               if (!result.contains(ch))
                   result = ch ;
           } else if(!result.contains(ch) && countOfCh == max){
                   result = result + ch;
           }

        }

        System.out.println(result);

    }
}
// check highest frequency of char and print it,
// if there are more than one char as max frequency then print all