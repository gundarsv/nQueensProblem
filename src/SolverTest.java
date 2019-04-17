import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolverTest {
    private Solver solver;
    @BeforeEach
    void setUp() {
        this.solver = new Solver();
    }

    @AfterEach
    void tearDown() {
        this.solver = null;
    }

    @Test
    void isSafeTestWhenQueenIsPlacedInFirstRowFirstColumnReturnsFalse() {
        //Creating a 4x4 board
        int[][] board = new int[4][4];
//        Queen is placed like this
//        1  0  0  0
//        0  0  0  0
//        0  0  0  0
//        0  0  0  0
        board[0][0] = 1;
//        Checking if this is safe should return false
//        1  0  0  0
//        0  1  0  0
//        0  0  0  0
//        0  0  0  0
        assertFalse(Solver.isSafe(board, 1, 1));
    }
    @Test
    void isSafeTestWhenQueenIsPlacedInFirstRowFirstColumnReturnsTrue() {
        //Creating a 4x4 board
        int[][] board = new int[4][4];
//        Queen is placed like this
//        1  0  0  0
//        0  0  0  0
//        0  0  0  0
//        0  0  0  0
        board[0][0] = 1;
//        Checking if this is safe should return true
//        1  0  0  0
//        0  0  1  0
//        0  0  0  0
//        0  0  0  0
        assertTrue(Solver.isSafe(board, 1, 2));
    }
}