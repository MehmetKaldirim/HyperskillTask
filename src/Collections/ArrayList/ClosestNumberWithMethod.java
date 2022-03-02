package Collections.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ClosestNumberWithMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> newNumbers = getUserInput();

        int num = scanner.nextInt();
        int dif = diferenceFromClosest(newNumbers, num);
        ArrayList<Integer> nearNumbers = findClosestNumbers(newNumbers, num, dif);

        Collections.sort(nearNumbers);
        printArray(nearNumbers);
    }


    private static void printArray(ArrayList<Integer> nearNumbers) {
        for (Integer s : nearNumbers) {
            System.out.print(s + " ");
        }
    }

    private static ArrayList findClosestNumbers(ArrayList<Integer> newNumbers, int num, int dif) {
        int lastIndex = newNumbers.size() - 1;
        List<Integer> nearNumbers = new ArrayList<>();
        for (int i = 0; i <= lastIndex; i++) {
            if (Math.abs(num - newNumbers.get(i)) == dif) {
                nearNumbers.add(newNumbers.get(i));
            }
        }
        return (ArrayList) nearNumbers;

    }

    private static int diferenceFromClosest(ArrayList<Integer> newNumbers, int num) {
        int lastIndex = newNumbers.size() - 1;
        int dif = Math.abs(num - newNumbers.get(0));
        for (int i = 1; i <= lastIndex; i++) {
            if (Math.abs(num - newNumbers.get(i)) <= dif) {
                dif = Math.abs(num - newNumbers.get(i));
            }
        }
        return dif;
    }

    private static ArrayList getUserInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String s = scanner.nextLine();
        String[] numbers = s.split(" ");
        for (String str : numbers) {
            list.add(Integer.parseInt(str));
        }
        scanner.close();
        return (ArrayList) list;
    }
    /*private static ArrayList getUserInput() {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        String str[] = numbers.split(" ");
        List<String> list = Arrays.asList(str);

        List<Integer> newNumbers = list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        return (ArrayList) newNumbers;
    }*/

}

