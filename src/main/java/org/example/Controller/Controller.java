package org.example.Controller;

import org.example.models.Board;

import org.example.view.View;

public class Controller {
    private Board board;
    private View view;
    private char currentPlayer;

    public Controller( Board board, View view) {
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

    }
}
