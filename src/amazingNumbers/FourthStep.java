package amazingNumbers;
import java.util.Scanner;

public class FourthStep{
    public static void main(String[] args) {
//        write your code here
        instructions();
        getInput();
    }

    public static void getInput(){
        Scanner sc = new Scanner(System.in);
        long secondNumber;
        while (true) {
            System.out.println("Enter a request: ");
            String number = sc.nextLine();
            String[] arr = number.split(" ");

            long firstNumber = Long.valueOf(arr[0]);

            if (arr.length == 2 && Long.valueOf(arr[1]) <= 0 ) {
                System.out.println("The second parameter should be a natural number");
            }

            if (arr.length == 2) {
                secondNumber = Long.valueOf(arr[1]);
                printPropertiesAll(firstNumber);
                while(secondNumber > 0) {
                    System.out.println(printPropertiesAll(firstNumber));
                    firstNumber ++;
                    secondNumber--;
                }
            }

            if (arr.length > 2) {
                String property = arr[2];
                boolean isProperty = property.equals("BUZZ") || property.equals("DUCK") || property.equals("PALINDROMIC") ||
                        property.equals("GAPFUL") || property.equals("SPY") || property.equals("EVEN") || property.equals("ODD");

                if (!isProperty){
                    System.out.printf("The property %s is wrong.",property);
                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]");

                } else {

                    long[] arrNums = searchNextNumbers(arr);
                    for (int i = 0; i < arrNums.length; i++ ){
                        System.out.println(printPropertiesAll(arrNums[i]));
                    }

                }
            }


            if (arr.length == 1) {
                if (firstNumber == 0) {
                    System.out.println("Goodbye");
                    break;
                } else if (firstNumber < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }

                printProperties(firstNumber);
            }

        }

    }


    public static long[] searchNextNumbers(String[] arr) {
        long firstNumber = Long.valueOf(arr[0]);
        long secondNumber= Long.valueOf(arr[1]);
        String select = arr[2];

        long[] nums = new long[(int) secondNumber];
        int j = 0;
        for ( long i = 0; j < secondNumber; i++){
            switch (select){
                case "BUZZ" :
                    if (isBuzz(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }
                    break;

                case "DUCK" :
                    if (isDuckNumber(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }
                    break;

                case "PALINDROMIC" :
                    if (isNumberPalindromic(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }
                    break;

                case "GAPFUL" :
                    if (isGapfulNumber(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }
                    break;

                case "SPY" :
                    if (isSpy(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }
                    break;

                case "EVEN" :
                    if (isEven(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }
                    break;

                case "ODD" :
                    if (isOdd(firstNumber + i)) {
                        nums[j] = firstNumber + i;
                        j++;
                    }


            }


        }

        return nums;
    }

    public static void instructions() {
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and a property to search for;");
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

    public static boolean isSpy(long num) {
        long product=1, sum=0;
        long lastdigit;
        while(num>0)  {

            lastdigit = lastDigit(num);
            //adds last digit to the variable sum
            sum=sum+lastdigit;
            //calculates the product
            product=product*lastdigit;
            //removes the last digit from the given number
            num=num/10;
        }
        return sum==product;
    }


    public static long firstDigit(long number) {
        long digit = (long) Math.log10(number);
        return (long)(number / Math.pow(10, digit));
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

    }

    public static String printPropertiesAll(long number) {
        String numberProperties = (number + " is ");

        if (isBuzz(number)) numberProperties+= "buzz ";
        if (isDuckNumber(number)) numberProperties+= "duck ";
        if (isNumberPalindromic(number)) numberProperties+= "palindromic ";
        if (isGapfulNumber(number)) numberProperties+= "gapful ";
        if (isSpy(number)) numberProperties+= "spy ";
        if (isEven(number)) numberProperties+= "even ";
        if (isOdd(number)) numberProperties+= "odd ";
        return numberProperties;
    }

}
