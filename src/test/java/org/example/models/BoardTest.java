package org.example.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @AfterEach
    void tearDown() {
        // Aquí puedes limpiar recursos si necesitas, pero no es obligatorio
    }

    @Test
    void isCellEmpty() {
        assertTrue(board.isCellEmpty(0,0));
    }

    @Test
    void isFull() {
        assertFalse(board.isFull());
    }

    @Test
    void placeMoveShouldUpdateBoard() {
        board.placeMove(1, 2, 'X'); // Colocar 'X' en fila 1, columna 2
        char[][] actualBoard = board.getBoard();
        assertEquals('X', actualBoard[1][2]); // Verificar que en esa posición está 'X'
    }

    @Test
    void checkWinner() {
        board.placeMove(0, 0, 'X');
        board.placeMove(0, 1, 'X');
        board.placeMove(0, 2, 'X');
        assertEquals('X', board.checkWinner());

        board = new Board();

        board.placeMove(0, 0, 'O');
        board.placeMove(0, 1, 'O');
        board.placeMove(0, 2, 'O');
        assertEquals('O', board.checkWinner());
    }

    @Test
    void getBoard() {
        char[][] actualBoard = board.getBoard();
        assertNotNull(actualBoard);
        assertEquals(3, actualBoard.length);
        assertEquals(3, actualBoard[0].length);

        for (int row = 0; row < actualBoard.length; row++) {
            for (int col = 0; col < actualBoard[row].length; col++) {
                assertEquals('_', actualBoard[row][col]);
            }
        }
    }
}


