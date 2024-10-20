
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int row = 0;
        int col = size / 2;

        for (int num = 1; num <= size * size; num++) {
            square.placeValue(col, row, num);

            int newRow = (row - 1 + size) % size;  // Move one row up, wrap around if needed
            int newCol = (col + 1) % size;         // Move one column right, wrap around if needed

            // If the new position is already filled, move one step down from the current position
            if (square.readValue(newCol, newRow) != 0) {
                row = (row + 1) % size;
            } else {
                row = newRow;
                col = newCol;
            }
        }


        return square;
    }

}
