package ticTacToe;
import java.util.Scanner;

public class Step3 {
    static int n = 3;
    static int counter = 0;
    static int count_ = 0;
    static char[][] intoArray = new char[n][n];

    public static void main(String[] args) {
        // write your code here
        emptyArray();
        intoArray();
        printBoard();

        String result = checkWinner();
        if (result.equals("X wins") || result.equals("O wins") ||result.equals("Draw")) {
            System.out.println(result);
        } else {
            System.out.println(isImpossible());
        }
    }

    private static String isImpossible() {
        String result = "";
        int countX = 0;
        int countO = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (intoArray[i][j] == 'X') {
                    countX += 1;
                } else if (intoArray[i][j] == 'O') {
                    countO += 1;
                } else {
                    count_ += 1;
                }
            }
        }
        if (Math.abs(countX - countO) > 1) {
            result = "Impossible";
        } else if (counter > 1) {
            result = "Impossible";
        } else if ( count_ >= 1) {
            result = "Game not finished";
        }
        return result;
    }


    private static String checkWinner() {
        String result = "";
        for (int i = 0; i < 3; i++) {
            if (intoArray[i][0] + intoArray[i][1] + intoArray[i][2] == 264) {
                result = "X wins";
                counter++;
            }

            if (intoArray[i][0] + intoArray[i][1] + intoArray[i][2] == 237) {
                result = "O wins";
                counter++;
            }


            if (intoArray[0][i] + intoArray[1][i] + intoArray[2][i] == 264) {
                result = "X wins";
                counter++;
            }

            if (intoArray[0][i] + intoArray[1][i] + intoArray[2][i] == 237) {

                result = "O wins";
                counter++;
            }
        }


        if (intoArray[0][0] + intoArray[1][1] + intoArray[2][2] == 264) {
            result = "X wins";
            counter++;

        }

        if (intoArray[0][0] + intoArray[1][1] + intoArray[2][2] == 237) {
            result = "O wins";
            counter++;
        }

        if (intoArray[0][2] + intoArray[1][1] + intoArray[2][0] == 264) {
            result = "X wins";
            counter++;
        }

        if (intoArray[0][2] + intoArray[1][1] + intoArray[2][0] == 237) {
            result = "O wins";
            counter++;
        }
        if (counter > 1) {
            result = "Impossible";
        }

        boolean a = !isImpossible().equals("Game not finished")&&!isImpossible().equals("Impossible");
        if (counter == 0 && a) {
            result = "Draw";
        }
        return result;
    }


    private static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print("| ");
                } else if (j == 4) {
                    System.out.print("|");
                } else {
                    System.out.print(intoArray[i][j - 1] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    private static void emptyArray() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                intoArray[i][j] = '_';
            }
        }
    }

    private static void intoArray() {
        int index = 0;
        System.out.print("Enter cells:");
        String input = getInput();
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                intoArray[i][j] = input.charAt(index);
                index++;
            }
        }
    }

    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}




