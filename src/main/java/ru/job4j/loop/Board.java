package ru.job4j.loop;

public class Board {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.paint(5, 4));
    }
    StringBuilder vertical = new StringBuilder();
    public String paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    vertical.append(' ');
                } else {
                    vertical.append('x');
                }
            }
            vertical.append('\n');
        }
        return vertical.toString();
    }
}
