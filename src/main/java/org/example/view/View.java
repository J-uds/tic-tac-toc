package org.example.view;

import org.example.models.Board;

import java.util.Scanner;

public class View {
    private final Scanner scanner = new Scanner(System.in);

    public void displayBoard(Board board) {
        char[][] grid = board.getBoard();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int[] askForMove(char currentPlayer) {
        System.out.println("Turno: " + currentPlayer);
        System.out.print("Selecciona una fila y una columna: ");

        while (true) {
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Por favor, introduce exactamente dos números separados por espacio.");
                continue;
            }
            try {
                int row = Integer.parseInt(parts[0]);
                int column = Integer.parseInt(parts[1]);
                return new int[]{row, column};
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Solo se permiten números.");
            }
        }
    }
    public void close() {
        scanner.close();
    }
}
