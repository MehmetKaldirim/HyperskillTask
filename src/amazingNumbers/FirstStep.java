package amazingNumbers;
import java.util.Scanner;

public class FirstStep {
    public static void main(String[] args) {
//        write your code here
        String result;
        String explanation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("This number is not natural!");
        } else {
            if (num % 2 == 0 ) {
                System.out.println("This number is Even.");
            } else {
                System.out.println("This number is Odd.");
            }
            if(num % 7 == 0 && num % 10 == 7) {
                result = "It is a Buzz number.";
                explanation = String.format("Explanation:%n%d is divisible by %d and ends with %d.", num,7,7);
            } else if (num % 7 == 0 && num % 10 != 7){
                result = "It is a Buzz number.";
                explanation = String.format("Explanation:%n%d is divisible by %d",num,7);
            } else if (num % 7 != 0 && num % 10 == 7 ) {
                result = "It is a Buzz number.";
                explanation = String.format("Explanation:%n%d ends with %d.",num,7);
            } else {
                result = "It is not a Buzz number.";
                explanation = String.format("Explanation:%n%d is neither divisible by %d nor does it end with %d.", num,7,7);
            }
            System.out.println(result);
            System.out.println(explanation);
        }
    }
}
