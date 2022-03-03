package amazingNumbers;
import java.util.Arrays;
import java.util.Scanner;

public class fourtStep {
    public static void main(String[] args) {
//        write your code here
        Scanner sc = new Scanner(System.in);

        start();

        while (true) {
            System.out.println("Enter a request: ");
            String number = sc.nextLine();
            String[] arr = number.split(" ");
            //System.out.println(Arrays.toString(arr));

            long firstNumber = Long.valueOf(arr[0]);
            //System.out.println("firstNumber = " + firstNumber);

            if (arr.length > 1 && Long.valueOf(arr[1]) <= 0 ) {
                System.out.println("The second parameter should be a natural number");
            }

            if (arr.length > 1) {
                long secondNumber = Long.valueOf(arr[1]);
               // System.out.println("secondNumber = " + secondNumber);



                while(secondNumber > 0) {
                    System.out.println(numberPropertiesTwo(firstNumber));
                    firstNumber ++;
                    secondNumber--;
                }
            }

            if (arr.length == 1) {
                if (firstNumber == 0) {
                    System.out.println("Goodbye");
                    break;
                } else if (firstNumber < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }

                numberProperties(firstNumber);
            }



        }
    }

    public static void start() {
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.\n\n");
    }

    public static boolean isOdd(long number) {
        return number % 2 != 0;
    }

    public static boolean isEven(long number) {
        return number % 2 ==0;
    }

    public static boolean isBuzz(long number) {

        int remainder;

        if (number % 7 == 0 && number % 10 == 7) {
            return true;

        } else if (number % 10 == 7 && number % 7 != 0) {
            return true;

        } else if (number % 7 == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean isDuckNumber(long number) {

        while (number > 0) {
            long remainder = number % 10;
            number = number / 10;

            if (remainder % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberPalindromic(long number) {
        long reversedNumber = 0, remainder;
        long orgNum = number;

        while(number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (orgNum == reversedNumber) {
            return true;
        }

        return false;

    }

    public static boolean isGapfulNumber(long number) {
        if (number <= 99) {
            return false;
        } else {
            long value = firstDigit(number) * 10 + lastDigit(number);
            if (number % value == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static long firstDigit(long number) {
        long digit = (long) Math.log10(number);
        return (long)(number / Math.pow(10, digit));
    }

    public static long lastDigit(long number) {
        return number % 10;
    }

    public static void numberProperties(long number) {
        System.out.println(" first number arrived" + number );
        System.out.println("Properties of " + number);
        System.out.println("even: " + isEven(number));
        System.out.println("odd: " + isOdd(number));
        System.out.println("buzz: " + isBuzz(number));
        System.out.println("duck: " + isDuckNumber(number));
        System.out.println("palindromic: " + isNumberPalindromic(number));
        System.out.println("gapful: " + isGapfulNumber(number));

    }

    public static String numberPropertiesTwo(long number) {


        String numberProperties = (number + " is ");

        if (isEven(number)) numberProperties+= "even ";
        if (isOdd(number)) numberProperties+= "odd ";
        if (isBuzz(number)) numberProperties+= "buzz ";
        if (isDuckNumber(number)) numberProperties+= "duck ";
        if (isNumberPalindromic(number)) numberProperties+= "palindromic ";
        if (isGapfulNumber(number)) numberProperties+= "gapful ";


        return  numberProperties;
    }


}