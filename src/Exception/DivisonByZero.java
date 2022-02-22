package Exception;

import java.util.Scanner;

public class DivisonByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (b == 0) {
            System.out.println("Division by zero!");//User friendly message
        } else {
            System.out.println(a / b);
        }
        System.out.println("finished");
    }
}
