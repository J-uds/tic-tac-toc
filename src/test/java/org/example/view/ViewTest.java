package org.example.view;

import org.example.models.Board;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {
    View view;

    @BeforeEach
    void setUp() {
        view = new View();
    }

    @Test
    void testDisplayBoard() {
        Board board = new Board();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.displayBoard(board);

        String output = outContent.toString();
        assertTrue(output.contains("_"));
        System.setOut(System.out);
    }

    @Test
    void testShowMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        view.showMessage("Test");
        String output = outContent.toString();
        assertTrue(output.contains("Test"));
        System.setOut(System.out);
    }

    @Test
    void testAskForMove() {
        String simulatedInput = "1 2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        View view = new View();
        int[] result = view.askForMove('X');
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        System.setIn(System.in);
    }

    @Test
    void testClose() {
        assertDoesNotThrow(view::close);
    }
}