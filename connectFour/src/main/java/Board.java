public interface Board<T> {
    T getPositionAbove(Position p) throws PositionOutOfBoundsException;
    T getPositionBelow(Position p) throws PositionOutOfBoundsException;
    T getPositionLeft(Position p) throws PositionOutOfBoundsException;
    T getPositionRight(Position p) throws PositionOutOfBoundsException;
    T getPositionAboveRight(Position p) throws PositionOutOfBoundsException;
    T getPositionAboveLeft(Position p) throws PositionOutOfBoundsException;
    T getPositionBelowRight(Position p) throws PositionOutOfBoundsException;
    T getPositionBelowLeft(Position p) throws PositionOutOfBoundsException;
}
