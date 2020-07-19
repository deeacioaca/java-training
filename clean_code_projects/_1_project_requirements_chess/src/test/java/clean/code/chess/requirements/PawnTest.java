package clean.code.chess.requirements;

import org.junit.Before;
import org.junit.Test;
import clean.code.chess.requirements.Pawn;
import clean.code.chess.requirements.PieceColor;

import static org.junit.Assert.*;

public class PawnTest {

    private ChessBoard chessBoard;
    private Pawn testSubject;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
        this.testSubject = new Pawn(PieceColor.BLACK);
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate() {
        this.chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        assertEquals(6, testSubject.getXCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate() {
        this.chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        assertEquals(3, testSubject.getYCoordinate());
    }


    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        testSubject.move(7, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        testSubject.move(4, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        testSubject.move(6, 2);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
    }

}