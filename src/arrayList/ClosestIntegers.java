package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;

public class ClosestIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> nearNumber = new ArrayList<>();
        String numbers = sc.nextLine();
        int num = sc.nextInt();

        String str[] = numbers.split(" ");
        List<String> list = Arrays.asList(str);

        List<Integer> newNumbers = list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());


        int lastIndex = newNumbers.size() - 1;
        int dif = Math.abs(num - newNumbers.get(0));
        for (int i = 1; i <= lastIndex; i++) {
            if (Math.abs(num - newNumbers.get(i)) <= dif) {
                dif = Math.abs(num - newNumbers.get(i));
            }
        }

        for (int i = 0; i <= lastIndex; i++) {
            if (Math.abs(num - newNumbers.get(i)) == dif) {
                nearNumber.add(newNumbers.get(i));
            }
        }
        Collections.sort(nearNumber);
        for (Integer s : nearNumber) {
            System.out.print(s + " ");
        }
    }

}


/*You need to use methods we haven't been taught (in my opinion, this makes this a bad
problem), you should use Collections.sort() which sorts a collection, and also
 Math.abs(a) which returns absolute value of a (if it is positive, it is the same,
  if it is negative it becomes the positive equivalent).

We were also not taught how to approach a complicated problem like this,
it is not good to just throw us into this with only the advanced users already
understanding what they need to do, lastly there was some poor wording in the question,
especially with the word "distance". I would recommend either avoiding problems like this
or teaching us everything we need to understand before giving it to us, it took me a
long time to figure out a lot of this because I had to learn on my own, go scrambling
around the internet to understand the necessary information when it could have been
taught in a topic.*/