package org.example.controller;

import org.example.models.Board;
import org.example.view.View;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void testStartGame() {
        String simulatedInput = String.join(System.lineSeparator(),
                "0 0",
                "1 1",
                "0 1",
                "1 2",
                "0 2");

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream simulatedIn = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream simulatedOut = new ByteArrayOutputStream();

        try {
            System.setIn(simulatedIn);
            System.setOut(new PrintStream(simulatedOut));

            Board board = new Board();
            View view = new View();
            Controller controller = new Controller(board, view);
            controller.startGame();

            String output = simulatedOut.toString();

            assertTrue(output.contains("¡Ganador: X!"));

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}