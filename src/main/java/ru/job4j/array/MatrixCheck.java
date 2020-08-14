package ru.job4j.array;

public class MatrixCheck {




    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] diagonallyAcross(char[][] board) {
        char[] array = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            array[i] = board[i][i];
            System.out.println(array[i]);
        }
        return array;
    }

    public static boolean monoVertical(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                result = monoHorizontal(board, i) || monoVertical(board, i);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }


}