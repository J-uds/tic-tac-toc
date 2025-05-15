package org.example.models;

public class Board {
    private char[][] board;
    private int size = 3;

    public Board() {
        board = new char[size][size];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                board [row][column] = '_';
            }
        }
    }

    public boolean isCellEmpty(int row, int column) {
        return board[row][column] == '_';
    }

    public boolean isFull() {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (board[row][column] == '_') {
                    return false;
                }
                return true;
            }
        }
    }
}

