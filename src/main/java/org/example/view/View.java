package org.example.view;

import org.example.models.Board;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void displayBoard (Board board) {
        char [][] grid = board.getBoard();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void showMessage(String message){
        System.out.println(message);
    }
    public int[] askForMove(char currentPlayer) {
        System.out.println("Turno: " + currentPlayer);
        System.out.print("Selecciona una fila y una columna: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        return new int[] { row, column };
    }

    public void close() {
        scanner.close();
    }
}
