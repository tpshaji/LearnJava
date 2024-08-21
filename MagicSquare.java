public class MagicSquare {
    public static void main(String[] args) {
        // Define the size of the magic square
        int size = 3;
        int[][] magicSquare = new int[size][size];
        
        // Fill the magic square
        fillMagicSquare(magicSquare, size);
        
        // Print the magic square
        printMagicSquare(magicSquare);
    }
    
    // Function to fill the magic square
    public static void fillMagicSquare(int[][] square, int size) {
        int num = 1;
        int i = 0, j = size / 2; // Start position
        
        while (num <= size * size) {
            square[i][j] = num++;
            int newRow = (i - 1 + size) % size;
            int newCol = (j + 1) % size;
            
            if (square[newRow][newCol] != 0) {
                i = (i + 1) % size;
            } else {
                i = newRow;
                j = newCol;
            }
        }
    }
    
    // Function to print the magic square
    public static void printMagicSquare(int[][] square) {
        int size = square.length;
        System.out.println("Magic Square (" + size + "x" + size + "):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
