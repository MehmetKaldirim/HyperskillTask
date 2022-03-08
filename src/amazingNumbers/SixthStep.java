package amazingNumbers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class SixthStep {
    public static void main(String[] args) {
//        write your code here
        instructions();
        getInput();
    }

    public static void instructions() {

        System.out.println("Welcome to Amazing Numbers!\n" + "\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "* the first parameter represents a starting number;\n" +
                "* the second parameter shows how many consecutive numbers are to be printed;\n" +
                "- two natural numbers and a property to search for;\n" +
                "- two natural numbers and two properties to search for;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
    }

    public static void getInput() {

        List<String> properties = List.of("EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "SUNNY", "SQUARE", "GAPFUL", "SPY");
        Scanner sc = new Scanner(System.in);
        long secondNumber;
        while (true) {
            System.out.println("Enter a request: ");
            String number = sc.nextLine();
            String[] arr = number.split(" ");

            long firstNumber = Long.valueOf(arr[0]);

            if (arr.length == 2 && Long.valueOf(arr[1]) <= 0) {
                System.out.println("The second parameter should be a natural number");
            }

            if (arr.length == 2) {
                secondNumber = Long.valueOf(arr[1]);
                printPropertiesAll(firstNumber);
                while (secondNumber > 0) {
                    System.out.println(printPropertiesAll(firstNumber));
                    firstNumber++;
                    secondNumber--;
                }
            }

            if (arr.length == 3) {
                String property = arr[2];


                if (!properties.contains(property.toUpperCase())) {
                    System.out.println("The property [" + property.toUpperCase() + "] is wrong.");
                    System.out.println("Available properties: " + properties);

                } else {

                    long[] arrNums = onePropertySearch(arr);
                    for (int i = 0; i < arrNums.length; i++) {
                        System.out.println(printPropertiesAll(arrNums[i]));
                    }

                }
            }


            if (arr.length == 4) {
                List<String> twoProperties = List.of(arr[2].toUpperCase(), arr[3].toUpperCase());
                String firstProperty = arr[2].toUpperCase();
                String secondProperty = arr[3].toUpperCase();

                if (!properties.contains(firstProperty) && !properties.contains(secondProperty)) {

                    System.out.println("The properties [" + firstProperty + ", " + secondProperty + "] are wrong.");
                    System.out.println("Available properties: " + "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]\n");

                } else if (!properties.contains(firstProperty)) {

                    System.out.println("The property ["  + firstProperty + "] is wrong.");
                    System.out.println("Available properties: " + "[BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]\n");

                } else if (!properties.contains(secondProperty)) {

                    System.out.println("The property [" + secondProperty + "] is wrong.");
                    System.out.println("Available properties: " + "[BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");

                } else if (twoProperties.contains("SQUARE") && twoProperties.contains("SUNNY")) {
                    System.out.println("The request contains mutually exclusive properties: [SQUARE, SUNNY]\n" +
                            "There are no numbers with these properties.");
                } else if (twoProperties.contains("EVEN") && twoProperties.contains("ODD")) {
                    System.out.println("The request contains mutually exclusive properties: [ODD, EVEN]\n" +
                            "There are no numbers with these properties.");
                } else if (twoProperties.contains("DUCK") && twoProperties.contains("SPY")) {
                    System.out.println("The request contains mutually exclusive properties: [DUCK, SPY]\n" +
                            "There are no numbers with these properties.");
                } else {

                    long[] mutNums = mutualPropertySearch(arr);

                    for (int i = 0; i < mutNums.length; i++) {
                        System.out.println(printPropertiesAll(mutNums[i]));
                    }

                }
            }


            if (arr.length == 1) {
                if (firstNumber == 0) {
                    System.out.println("Goodbye");
                    System.exit(0);
                } else if (firstNumber < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }

                printProperties(firstNumber);
            }

        }

    }

    public static long[] mutualPropertySearch(String[] arr) {
        long firstNumber = Long.valueOf(arr[0]);
        long secondNumber = Long.valueOf(arr[1]);
        boolean first = false;
        boolean second = false;
        String firstProperty = arr[2].toUpperCase();
        String secondProperty = arr[3].toUpperCase();
        long[] nums = new long[(int) secondNumber];
        int j = 0;

        for (long i = 0; j < secondNumber; i++) {


            first = selectProperty(firstProperty, firstNumber);
            second = selectProperty(secondProperty, firstNumber);

            if (first && second) {
                nums[j] = firstNumber;
                j++;
            }
            firstNumber = firstNumber + 1;

        }

        return nums;
    }

    public static long[] onePropertySearch(String[] arr) {
        long firstNumber = Long.valueOf(arr[0]);
        long secondNumber = Long.valueOf(arr[1]);
        boolean isTrue = false;
        String property = arr[2].toUpperCase();
        long[] nums = new long[(int) secondNumber];
        int j = 0;
        for (long i = 0; j < secondNumber; i++) {
            isTrue = selectProperty(property, firstNumber);
            if (isTrue) {
                nums[j] = firstNumber;
                j++;
            }
            firstNumber = firstNumber + 1;

        }


        return nums;
    }


    public static boolean selectProperty(String property, long number) {

        boolean result = false;
        switch (property) {
            case "BUZZ":
                result = isBuzz(number);
                break;

            case "DUCK":
                result = isDuckNumber(number);
                break;


            case "PALINDROMIC":
                result = isNumberPalindromic(number);
                break;

            case "GAPFUL":
                result = isGapfulNumber(number);
                break;

            case "SPY":
                result = isSpy(number);
                break;

            case "EVEN":
                result = isEven(number);
                break;

            case "ODD":
                result = isOdd(number);
                break;

            case "SUNNY":
                result = isSunny(number);
                break;

            case "SQUARE":
                result = isSquare(number);
                break;
        }
        return result;

    }




    public static boolean isOdd(long number) {
        return number % 2 != 0;
    }

    public static boolean isEven(long number) {
        return number % 2 == 0;
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

        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (orgNum == reversedNumber) {
            return true;
        }

        return false;

    }

    public static boolean isSpy(long num) {
        long product = 1, sum = 0;
        long lastdigit;
        while (num > 0) {

            lastdigit = lastDigit(num);
            //adds last digit to the variable sum
            sum = sum + lastdigit;
            //calculates the product
            product = product * lastdigit;
            //removes the last digit from the given number
            num = num / 10;
        }
        return sum == product;
    }

    public static boolean isSunny(long number) {
        if (Math.sqrt(number + 1) % 1 == 0)
            return true;
        else return false;
    }

    public static boolean isSquare(long number) {
        if (Math.sqrt(number) % 1 == 0)
            return true;
        else return false;
    }


    public static long firstDigit(long number) {
        long digit = (long) Math.log10(number);
        return (long) (number / Math.pow(10, digit));
    }

    public static long lastDigit(long number) {
        return number % 10;
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


    public static void printProperties(long number) {

        System.out.println("Properties of " + number);
        System.out.println("buzz: " + isBuzz(number));
        System.out.println("duck: " + isDuckNumber(number));
        System.out.println("palindromic: " + isNumberPalindromic(number));
        System.out.println("gapful: " + isGapfulNumber(number));
        System.out.println("spy: " + isSpy(number));
        System.out.println("even: " + isEven(number));
        System.out.println("odd: " + isOdd(number));
        System.out.println("square: " + isSquare(number));
        System.out.println("sunny: " + isSunny(number));

    }

    public static String printPropertiesAll(long number) {
        String numberProperties = (number + " is ");

        if (isBuzz(number)) numberProperties += "buzz ";
        if (isDuckNumber(number)) numberProperties += "duck ";
        if (isNumberPalindromic(number)) numberProperties += "palindromic ";
        if (isGapfulNumber(number)) numberProperties += "gapful ";
        if (isSpy(number)) numberProperties += "spy ";
        if (isEven(number)) numberProperties += "even ";
        if (isOdd(number)) numberProperties += "odd ";
        if (isSquare(number)) numberProperties += "square ";
        if (isSunny(number)) numberProperties += "sunny ";
        return numberProperties;
    }

}
