package string;

import java.util.Scanner;

public class FindFrequncy {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.next();
        int counter = 0;

         while(str.indexOf(sub)!=-1){
             counter ++;
             str = str.replaceFirst(sub,"");
         }
        System.out.println(counter);
    }
}

