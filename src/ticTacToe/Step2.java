package ticTacToe;

import java.util.Scanner;

public class Step2 {
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

