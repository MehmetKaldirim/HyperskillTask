package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {
    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        // write your code here
        phones.removeIf(x -> blacklist.contains(x));
        //phones.removeAll(blacklist); //it is also solution
        return phones;
    }
}

/* Please, do not modify this I/O code */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));
        System.out.println(nonBlockedPhones.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
/*Has it ever bothered you when unknown people call you and try
to impose their services? That can be annoying.Let's try to solve the problem
by using a blacklist. You should implement the filterPhone method that returns
only the phone numbers that are not on the blacklist.
list  387 968 2999 505 468 5235 739 738 3272
black list 505 468 5235*/