package com.company;


public class ChessBoard {
    int width;
    int height;

    public ChessBoard(int width, int height, StringBuilder vertical) {
        this.width = width;
        this.height = height;
    }

    StringBuilder vertical = new StringBuilder();

    ChessBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String drawBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    vertical.append(' ');
                } else {
                    vertical.append('*');
                }
            }
            vertical.append('\n');
        }
        return vertical.toString();
    }
}
