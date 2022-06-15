package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int sell = 0; sell < board.length; sell++) {
            if (board[row][sell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
