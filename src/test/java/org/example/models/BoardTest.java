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
    }

   /* @Test
    void initializeBoard() {
    } */

    @Test
    void isCellEmpty() {
        assertTrue(board.isCellEmpty(0,0));
    }

    @Test
    void isFull() {
        assertFalse(board.isFull());
    }

    @Test
    void placeMove() {
    }

    @Test
    void checkWinner() {
        board.placeMove(0, 0, 'X');
        board.placeMove(0, 1, 'X');
        board.placeMove(0, 2, 'X');
        assertEquals('X', board.checkWinner());

        board.placeMove(0, 0, 'О');
        board.placeMove(0, 1, 'О');
        board.placeMove(0, 2, 'О');
        assertEquals('О', board.checkWinner());

    }

    @Test
    void getBoard() {
    }
}