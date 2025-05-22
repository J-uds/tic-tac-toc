package org.example.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void testIsCellEmpty() {
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void testIsFull() {
        assertFalse(board.isFull());
    }

    @Test
    void testCheckWinner() {
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
    void testPlaceMove() {
        board.placeMove(1, 2, 'X');
        assertEquals('X', board.getBoard()[1][2]);
    }

    @Test
    void testWinnerOnDiagonal() {
        Board board = new Board();
        board.getBoard()[0][0] = 'X';
        board.getBoard()[1][1] = 'X';
        board.getBoard()[2][2] = 'X';
        assertEquals('X', board.checkWinner());
    }
}









