package org.example.controller;

import org.example.models.Board;

import org.example.view.View;

public class Controller {
    private Board board;
    private View view;
    private char currentPlayer;

    public Controller(Board board, View view) {
        this.board = board;
        this.view = view;
        this.currentPlayer = 'X';
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(char currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void startGame() {
        boolean gameOver = false;

        view.showMessage("Juguemos tic tac toe\nEl tablero se compone de fila 0 - 1 y 2 y de columna 0 - 1 y 2");
        view.displayBoard(board);

        while (!gameOver) {
            int[] move = view.askForMove(currentPlayer);
            int row = move[0];
            int col = move[1];

            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                view.showMessage("Coordenadas fuera de rango. Intenta de nuevo.");
                continue;
            }

            if (!board.isCellEmpty(row, col)) {
                view.showMessage("Esa celda ya está ocupada. Intenta otra vez.");
                continue;
            }

            board.placeMove(row, col, currentPlayer);
            view.displayBoard(board);

            char winner = board.checkWinner();

            if (winner != '_') {
                view.showMessage("¡Ganador: " + winner + "!");
                gameOver = true;
            } else if (board.isFull()) {
                view.showMessage("¡Empate!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        view.close();
    }
}
