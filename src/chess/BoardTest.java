package Tests;
import Tests.ChessBoard;
import junit.framework.TestCase;
import org.junit.Test;

public class BoardTest {
    public void testAddPawnToBoard() {
        ChessBoard board = new ChessBoard();
    }

    public void testAddPawnsToBoard() {
        Board board = new Board();
        Pawn whitePawn = new Pawn(Pawn.WHITE);
        Pawn blackPawn = new Pawn(Pawn.BLACK);

        board.addPawn(WhitePawn);
        board.addPawn(blackPawn);

        assertEquals(2, board.getPieceCount());
        assertTrue(board.getPawns().contains(WhitePawn));
        assertTrue(board.getPawns(). contains(BlackPawn));
    }

}
