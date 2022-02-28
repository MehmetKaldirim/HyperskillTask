package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class SquaresList {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        // write your code here
        Collection<Integer> powOfNumbers = new ArrayList<>();


        for (Integer digit : numbers) {
            powOfNumbers.add(digit * digit);
        }

        return powOfNumbers;
    }


/* Please, do not modify this I/O code */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = SquaresList.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
/*Implement a method called pow2 that takes a collection of numbers and returns a collection of squares of these numbers.

Do not modify elements of the given collection, create a new one and return it as the result instead.*/