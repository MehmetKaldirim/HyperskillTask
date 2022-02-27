package ticTacToe;


import java.util.Scanner;

public class Step4 {
    public static int[] userInput = new int[2];
    public static String[][] b = new String[3][3];

    public static void display(String[][] a) {
        System.out.println("---------");
        System.out.println("| " + a[0][0] + " " + a[0][1] + " " + a[0][2] + " |");
        System.out.println("| " + a[1][0] + " " + a[1][1] + " " + a[1][2] + " |");
        System.out.println("| " + a[2][0] + " " + a[2][1] + " " + a[2][2] + " |");
        System.out.println("---------");
    }
    public static void reply() {
        System.out.print("Enter the coordinates:");
        Scanner sc = new Scanner(System.in);
        String coordinat = sc.next();
        coordinat = coordinat.replaceAll(" ", "");
        char firstChar;
        for (int i = 0; i < coordinat.length(); i++) {
            firstChar = coordinat.charAt(i);
            while (firstChar < '0' || firstChar > '9') {
                System.out.println("You should enter numbers!");
                reply();
                break;
            }
        }


        int num1 = coordinat.charAt(0) - 48;
        int num2 = coordinat.charAt(1) - 48;


        while ((num1 > 3) || (num1 < 1) || (num2 > 3) || (num2 < 1)) {
            System.out.println("Coordinates should be from 1 to 3!");
            reply();
            break;
        }

        userInput[0] = num1;
        userInput[1] = num2;
        placeChar(b, userInput);
    }


    public static void placeChar(String[][] a, int[] b) {
        //Anti occupied cell
        if (!a[b[0] - 1][b[1] - 1].equals(" ")) {
            System.out.println("This cell is occupied! Choose another one!");
            reply();
        } else {
            a[b[0] - 1][b[1] - 1] = "X";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");

        String input = scanner.nextLine();

        String[] aTemp = new String[3];

        String temp;


        aTemp[0] = input.substring(0,3);
        aTemp[1] = input.substring(3,6);
        aTemp[2] = input.substring(6,9);

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp =  String.valueOf(aTemp[i].charAt(j));
                if(temp.equals("_")) {
                    b[i][j] = " ";
                } else {
                    b[i][j] = temp;
                }
            }
        }

        display(b);
        reply();
        display(b);

    }
}

//X_X_O____ ,_XXOO_OX_,  _XXOO_OX_, _XXOO_OX_,_XXOO_OX_,_XXOO_OX_,_XXOO_OX_
