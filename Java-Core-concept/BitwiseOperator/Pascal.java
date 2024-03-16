package BitwiseOperator;

public class Pascal {
    public static void main(String[] args) {
        int row = 2; // Specify the row number (0-based index)
        int position = 0; // Specify the position in the row (0-based index)

        int result = calculatePascalValue(row, position);

        System.out.println("The value at row " + row + ", position " + position + " is: " + result);
    }

    private static int calculatePascalValue(int row, int position) {
        int result = 1;

        for (int i = 1; i <= position; i++) {
            result *= (row - i + 1);
            result /= i;
        }

        return result << (row - position);
    }
}
