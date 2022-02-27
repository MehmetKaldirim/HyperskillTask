package amazingNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class ThirdWithBig {
    static String numberCanavar;
    static BigInteger n;

    public static void main(String[] args) {


        System.out.println(welcome());
        // We will take user digit as string , we warn it to enter integer and natural number
        String numberString = getUserInput();
        // we take the char digit and assign them into array and then into number

        n = intoBig(numberString);
        BigInteger zero = BigInteger.valueOf(0);


        while (!n.equals(zero)) {//loops keep asking if the user does't input 0;


            int lastDigit = lastDigit(numberString);






            System.out.println("Properties of " + n);
            System.out.println("even: " + isEven(lastDigit));
            System.out.println("odd: " + !isEven(lastDigit));

            System.out.println("buzz: " + isBuzz(numberString, lastDigit));
            System.out.println("duck: " + isDuck(numberString));
            System.out.println("palindromic: " + isPalindromic(numberString));

            numberString = getUserInput();
            n = intoBig(numberString);

        }

        System.out.println("Goodbye!");
    }


    public static String welcome() {
        String welcome = String.format("Welcome to Amazing Numbers!%n" +
                "Supported requests:%n" +
                "- enter a natural number to know its properties;%n" +
                "- enter 0 to exit.");
        return welcome;
    }


    public static boolean isDuck(String number) {
        return number.contains("0");
    }

    public static boolean isBuzz(String numberString, int lastDigit) {


        BigInteger longLim = BigInteger.valueOf(9_223_372_036_854_775_807L);
        BigInteger intLim = BigInteger.valueOf(2147483647);
        BigInteger n = intoBig(numberString);

        boolean smallerThanLong = n.compareTo(longLim) < 0;
        System.out.println("smaller than Long"+ smallerThanLong);
        boolean smallerThanInt = n.compareTo(intLim) < 0;

        boolean result;
        if (smallerThanInt) {
            int intNum = n.intValue();
            System.out.println("int number"+ intNum);
            result = (intNum % 7 == 0 || intNum % 10 == 7);
            System.out.println("int result"+ result);

        } else {
            BigInteger num = intoBigWithoutLast(numberString);
            System.out.println("Big Int Without"+ num);
            System.out.println("last digit multi 2 "+BigInteger.valueOf(lastDigit * 2) );
            num = num.subtract(BigInteger.valueOf(lastDigit * 2));
            System.out.println("last digit minus multi 2 " + num);
            BigInteger zero = BigInteger.valueOf(0);
            BigInteger remainder = num.remainder(BigInteger.valueOf(7));
            System.out.println("Big Int remainder "+ remainder);
            result = remainder.equals(zero);
            System.out.println("Big Int result"+ remainder);
        }

        return result || lastDigit ==7;
    }


    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


    private static boolean isPalindromic(String number) {
        String reverseNumber = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            reverseNumber += "" + number.charAt(i);

        }

        return reverseNumber.equals(number);
    }


    private static String getStringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    // We will take user digit as string , we warn it to enter integer and natural numbers.
    private static String getUserInput() {

        System.out.println("Enter a request:");
        numberCanavar = getStringInput();


        if (numberCanavar.charAt(0) == '-') {
            System.out.println("The first parameter should be a natural number or zero.");
            getUserInput();
        } else {
            int i = numberCanavar.length() - 1;
            // we will check user input is digit or not
            while (i > 0) {
                if (numberCanavar.charAt(i) < '0' || numberCanavar.charAt(i) > '9') {
                    System.out.println("You should enter numbers!");
                    getUserInput();
                } else i--;
            }
            System.out.println("First String Number"+ numberCanavar);


        }

        return numberCanavar;

    }

    // we will split user string digit and  assign them into array
    private static BigInteger intoBig(String number) {
        BigInteger BigNumber = BigInteger.valueOf(0);
        BigNumber = BigNumber.add(new BigInteger(number));
        System.out.println("intoBig = " + BigNumber );
        return BigNumber;

    }

    private static BigInteger intoBigWithoutLast(String number) {

        int length = number.length();
        System.out.println("length of number "+ length);
        String number1 = "";
        if (length == 1) {
            number1 = number;
        } else {
            for (int i = 0; i < length - 1; i++) {
                number1 += number.charAt(i);
                System.out.println("intoBigWithoutlastString = " + number1 );
            }
        }

        BigInteger C = BigInteger.valueOf(0);

        C = C.add(new BigInteger(number1));
        System.out.println("intoBigWithoutlast = " + C );

        return C;
    }

    private static int lastDigit(String number) {

        return number.charAt(number.length() - 1) - 48;
    }


}
///3240830673470506574 - 9223372036854775807 -5734059856468814027
/* learn try catch
 private static int isNatural() {
        int natural = 1;
        try {
            number = scanner.nextLong();
            if (number < 0) {
                natural = -1;
            } else if (number == 0) {
                natural = 0;
            }
        } catch (Exception e) {
            natural = -1;
        }
        return natural;
    }
    laerning long.toString
     private static boolean isDuck() {
        boolean duck = true;
        String string = Long.toString(number);
        if (!string.substring(1).contains("0")) {
            duck = false;
        }
        return duck;
    }

    simple example without BigInteger or Checking String
    package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Checker checker = new Checker();
        checker.startCheck();
    }
}

class Checker {
    private long number;
    Scanner scanner = new Scanner(System.in);

    public void startCheck() {
        System.out.println("Welcome to Amazing Numbers!\n" +
                "\nSupported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");
        while (true) {
            System.out.print("\nEnter a request: ");
            setNumber();
            if (number == 0) {
                System.out.println("\nGoodbye!");
                break;
            }
            if (isNatural()) {
                continue;
            }
            printExplanation();
        }
    }

    private void printExplanation() {
        System.out.printf("Properties of %d%n" +
                "        even: %s%n" +
                "         odd: %s%n" +
                "        buzz: %s%n" +
                "        duck: %s%n" +
                " palindromic: %s%n",
                number, !isOdd(), isOdd(), isBuzz(),
                isDuck(), isPalindromic());
    }

    private boolean isDuck() {
        return String.valueOf(number).contains("0");
    }

    private boolean isPalindromic() {
        StringBuilder string = new StringBuilder(String.valueOf(number));
        String original = string.toString();
        String reversed = string.reverse().toString();
        return original.equals(reversed);
    }

    private boolean isNatural() {
        if (number < 1) {
            System.out.println("\nThe first parameter should be a natural number or zero.");
            return true;
        }
        return false;
    }

    private void setNumber() {
        this.number = scanner.nextLong();
    }

    private boolean isOdd() {
        return number % 2 != 0;
    }

    private boolean isBuzz() {
        final int seven = 7;
        final int ten = 10;
        return number % seven == 0 || number % ten == seven;
    }
}
 another example with good structure
 package numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static final BigInteger EXIT_CODE = BigInteger.ZERO;

    public static void main(String[] args) {
        //read the number
        System.out.println("Welcome to Amazing Numbers!");

        showMenu();
        System.out.print("\nEnter a request: ");
        String numberText = scanner.nextLine();
        BigInteger number = new BigInteger(numberText);
        while (!number.equals(EXIT_CODE)) {
            try {
                Number nr = new Number(number);
                System.out.println(nr);
            } catch (IllegalArgumentException ex) {
                System.out.println("The first parameter should be a natural number or zero.");
            }
            System.out.print("\nEnter a request: ");
            numberText = scanner.nextLine();
            number = new BigInteger(numberText);

        }
        System.out.println("Goodbye!");


    }

    private static void showMenu() {
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");

    }
}
package numbers;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class Number {
    private BigInteger number;
    private boolean isEven;
    private boolean isOdd;
    private boolean isBuzz;
    private boolean isDuck;
    private boolean isPalindrome;

    public Number(BigInteger number) {
        setNumber(number);
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) <= 0)
            throw new IllegalArgumentException();
        this.number = number;

        initializeProperties();
    }

    private void initializeProperties() {
        isBuzz = checkIsBuzzNumber(number);
        isEven = number.mod(BigInteger.TWO).equals(BigInteger.ZERO);
        isDuck = checkIsDuckNumber(number);
        isOdd = !isEven;
        isPalindrome = checkIsPalindrome(number);
    }

    private boolean checkIsPalindrome(BigInteger number) {
        StringBuilder text = new StringBuilder(number.toString());
        StringBuilder reverseText = new StringBuilder(number.toString()).reverse();
        return text.toString().equals(reverseText.toString());
    }

    private boolean checkIsBuzzNumber(BigInteger number) {
        int lastDigit = number.mod(BigInteger.TEN).intValue();
        boolean endWith7 = lastDigit == 7;
        boolean isDivisible = endWith7 || isDivisibleBy7(number);
        return endWith7 || isDivisible;
    }

    private static boolean checkIsDuckNumber(BigInteger number) {
        // iterate through number till become a zero:)
        while (number.compareTo(BigInteger.ZERO) > 0) {
            if (number.mod(BigInteger.TEN) == BigInteger.ZERO) {
                return true;
            }
            number = number.divide(BigInteger.TEN);
        }
        return false;
    }

    private static boolean isDivisibleBy7(BigInteger number) {
        return number.mod(BigInteger.valueOf(7)) == BigInteger.ZERO;
    }

    @Override
    public String toString() {
        StringBuilder formatText = new StringBuilder();

        formatText.append("Properties of "
                + NumberFormat.getNumberInstance(Locale.US).format(number)
                + "\n");
        formatText.append(String.format("%12s: %s%n", "even", isEven));
        formatText.append(String.format("%12s: %s%n", "odd", isOdd));
        formatText.append(String.format("%12s: %s%n", "buzz", isBuzz));
        formatText.append(String.format("%12s: %s%n", "duck", isDuck));
        formatText.append(String.format("%12s: %s%n", "palindromic", isPalindrome));
        return formatText.toString();
    }
}
 and finally a good intro
    public static void printIntro() {
        long number = 1;
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests: ");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.\n");
        while (true) {
            System.out.print("Enter a request: ");
            number = scanner.nextLong();
            if (number == 0) {
                break;
            }
            printProperties(number);
        }
        System.out.println("\nGoodbye!\n");
    }
 ////////
    public static void printIntro() {
        long number = 1;
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests: ");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.\n");
        while (true) {
            System.out.print("Enter a request: ");
            number = scanner.nextLong();
            if (number == 0) {
                break;
            }
            printProperties(number);
        }
        System.out.println("\nGoodbye!\n");
    }

    */