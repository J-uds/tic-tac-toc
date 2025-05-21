package org.example;

import org.example.controller.Controller;
import org.example.models.Board;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        View view = new View();
        Controller controller = new Controller(board, view);
        controller.startGame();
    }
}