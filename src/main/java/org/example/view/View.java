package org.example.view;

import org.example.models.Board;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void displayBoard (Board board) {
        char [][] grid = board.getBoard();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                System.out.println(grid[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void showMessage(String message){
        System.out.println();
    }
}
