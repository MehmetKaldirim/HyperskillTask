package amazingNumbers;
import java.util.Scanner;

public class SecondStep {
    public static void main(String[] args) {

        // We will take user digit as string , we warn it to enter integer and natural number
        String numberString = getUserInput();
        // we take the char digit and assign them into array
        int n = convertStringToNumber(intoArray(numberString));

        if (n <= 0) {
            System.out.println("This number is not natural!");
        } else {
            System.out.println("Properties of " + n);
            System.out.println("even: " + isEven(n));
            System.out.println("odd: " + !isEven(n));
            System.out.println("buzz: " + isBuzz(n));
            System.out.println("duck: " + isDuck(numberString));
        }
    }
    // we are checking here is there 0 in the user input
    public static boolean isDuck(String number){
        return number.contains("0");
    }

    public static boolean isBuzz(int n){
        return n % 10 == 7 || n % 7 == 0;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }



    private static String getStringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
    // We will take user digit as string , we warn it to enter integer and natural numbers.
    private static String getUserInput() {

        System.out.println("Enter a natural number:");
        String number = getStringInput();
        number = number.replaceAll(" ", "");

        // we will check user input is digit or not
        if (number.charAt(0) < '0' || number.charAt(0) > '9'){
            System.out.println("You should enter numbers!");
            getUserInput();
        }
        return number;

    }


    // we will split user string digit and  assign them into array
    private static int[] intoArray(String number) {


        int length = number.length();
        int numbers[] = new int[length];

        for(int i=0; i < length ; i++){
            numbers[i] = number.charAt(i) - 48;
        }
        return numbers;
    }

    //we will teke the digit from array and assign them an integer variable
    private static int  convertStringToNumber(int[] numbers){
        int i =numbers.length-1;
        int j = 0;
        int number =0;
        while( i >= 0){
            number +=(int)numbers[i] *  Math.pow(10,j);
            i--;
            j++;
        }
        return number;

    }
}