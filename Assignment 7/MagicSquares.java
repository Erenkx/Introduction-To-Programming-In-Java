import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquares {

    public static void main(String[] args) {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }

    public static boolean testMagic(String pathName) {
        boolean isMagic = false;
        try {
            File file = new File(pathName);
            Scanner scanner = new Scanner(file);

            ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.strip();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\t");
                ArrayList<Integer> row = new ArrayList<Integer>();
                for (String part : parts) {
                    row.add(Integer.parseInt(part));
                }
                matrix.add(row);
            }

            isMagic = checkMatrix(matrix);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + pathName);
            System.exit(1);
        }

        return isMagic;
    }

    private static boolean checkMatrix(ArrayList<ArrayList<Integer>> matrix) {
        int order = matrix.size();
        int lastSum = -1;

        int diagonalSum = 0;
        int antiDiagonalSum = 0;
        for (int i = 0; i < order; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < order; j++) {
                rowSum += matrix.get(i).get(j);
                colSum += matrix.get(j).get(i);
            }

            if (lastSum == -1) {
                lastSum = rowSum;
            }

            if (rowSum != lastSum || colSum != lastSum) {
                return false;
            }

            diagonalSum += matrix.get(i).get(i);
            antiDiagonalSum += matrix.get(order - 1 - i).get(i);
        }

        if (diagonalSum != lastSum || antiDiagonalSum != lastSum) {
            return false;
        }

        return true;
    }

}
