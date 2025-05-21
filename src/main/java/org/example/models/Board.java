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
            }
        }
        return true;
    }

    public void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    private char checkRowColumn() {
        for (int i = 0; i < size; i++) {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }

            if (board[0][i] != '_' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        return '_';
    }

    private char checkDiagonal() {
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return '_';
    }

    public char checkWinner() {
        char result = checkRowColumn();
        if (result != '_') {
            return result;
        }

        result = checkDiagonal();
        if (result != '_') {
            return result;
        }

        return '_';
    }

    public char[][] getBoard() {
        return board;
    }

}

