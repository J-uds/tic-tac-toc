package org.example.Controller;

import org.example.models.Board;

import org.example.view.View;

public class Controller {
    private Board board;
    private View view;
    private char currentPlayer;

    public Controller() {
        this.board = new Board();
        this.view = new View();
        this.currentPlayer = 'X';
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(char currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void startGame() {
        view.showMessage("Juguemos tic tac toe\nEl tablero se compone de fila 0 - 1 y 2 y de columna 0 - 1 y 2");
        view.displayBoard(board);
        int[] playerMove = view.askForMove(currentPlayer);
        int row = playerMove[0];
        int column = playerMove[1];
        if (!board.isCellEmpty(row, column)){
            view.showMessage("La posición está ocupada");
        }
    }


}
