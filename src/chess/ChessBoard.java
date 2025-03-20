package Tests;
import Tests.Pawn;

import java.util.ArrayList;

public class ChessBoard {
    static final int SQUARES_PER_SIDE = 8;
    public int numberOfSquares = ChessBoard.SQUARES_PER_SIDE * ChessBoard.SQUARES_PER_SIDE;

    private List<Pawn> pieces = new ArrayList<>();

    public int getPieceCount() {
        return pieces.size();
    }

}
