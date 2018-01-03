public class Position {

    private final short ROW;
    private final short COLUMN;

    public Position(short row, short column) {
        this.ROW = row;
        this.COLUMN = column;
    }

    public short getRow() {
        return ROW;
    }

    public short getColumn() {
        return COLUMN;
    }
}
