package ticTacToe;

public class Step1 {
    static int n = 3;
    static char[][] ticTacToeBoard = new char[n][n];
    public static void main(String[] args) {
        // write your code here
        initializeTicTacToeGrid();
        creatBoard();
    }

    private static void creatBoard() {
        for (char[] array : ticTacToeBoard) {
            for (char play : array) {
                System.out.printf("%s ", play);
            }
            System.out.println();
        }
    }

    private static void initializeTicTacToeGrid() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ticTacToeBoard[i][j] = i == j ? 'X' : 'O';
            }
        }
    }
}




 /*   public static void main(String[] args) {
        // write your code here
        int n = 3;
        char[][] twoDimArray = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDimArray[i][j] = i == j ? 'X' : 'O';

                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

Objectives
Your first task in this project is to print the game grid in the console output.
Use what you’ve learned about the print() function to print three lines,
each containing three characters (X’s and O’s) to represent a game of tic-tac-toe
where all fields of the grid have been filled in.
Example
The example below shows how your output might look:

X O X
O X O
X X O
*/
