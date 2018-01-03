public class ConnectFourBoard implements Board<ConnectFourPiece> {

    private short[][] board;
    private static final short RED = 1;
    private static final short BLACK = 2;
    private static final short EMPTY = 0;

    public ConnectFourBoard() {
        this.board = new short[7][6];
    }

    public ConnectFourPiece getPositionAbove(Position p) throws PositionOutOfBoundsException {
        try {
            return getPiece(board[p.getColumn()][p.getRow() - 1]);
        } catch (IndexOutOfBoundsException e) {
            throw new PositionOutOfBoundsException();
        }
    }

    public ConnectFourPiece getPositionBelow(Position p) {
        return null;
    }

    public ConnectFourPiece getPositionLeft(Position p) {
        return null;
    }

    public ConnectFourPiece getPositionRight(Position p) {
        return null;
    }

    public ConnectFourPiece getPositionAboveRight(Position p) {
        return null;
    }

    public ConnectFourPiece getPositionAboveLeft(Position p) {
        return null;
    }

    public ConnectFourPiece getPositionBelowRight(Position p) {
        return null;
    }

    public ConnectFourPiece getPositionBelowLeft(Position p) {
        return null;
    }

    private ConnectFourPiece getPiece(short val) {
        switch (val) {
            case 1:
                return ConnectFourPiece.RED;
            case 2:
                return ConnectFourPiece.BLACK;
            case 0:
                return ConnectFourPiece.NONE;
            default:
                throw new RuntimeException("Unrecognized value at location");
        }
    }

}
