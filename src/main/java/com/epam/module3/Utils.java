package com.epam.module3;

public class Utils {
    public static void matrixShow(Matrix matrix) {
        double[][] value = matrix.getValue();
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double calculateDeterminant(Matrix matrix) {
        double[][] value = matrix.getValue();
        double result = value[0][0] * value[1][1] * value[2][2] +
                     value[1][0] * value[2][1] * value[0][2] +
                     value[0][1] * value[1][2] * value[2][0] -
                     value[0][2] * value[1][1] * value[2][0] -
                     value[0][1] * value[1][0] * value[2][2] -
                     value[0][0] * value[2][1] * value[1][2];
        return result;
    }

    public static Matrix calculateReturnMatrix(Matrix matrix, double determinant) {
        int size = matrix.getSize();
        double[][] value = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                value[i][j] = Math.pow(-1, i + j + 2) * calculateMinorDeterminant(matrix, i, j) * (1 / determinant);
            }
        }
        Matrix result = new Matrix(size);
        result.setValue(value);
        return result;
    }

    private static double calculateMinorDeterminant(Matrix matrix, int row, int col) {
        double value[][] = matrix.getValue();
        double newValue[] = new double[5];
        int k = 0;
        double result;
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                if (i != row && j != col) {
                    newValue[k] = value[i][j];
                    k++;
                }
            }
        }
        result = newValue[0] * newValue[3] - newValue[1] * newValue[2];
        return result;
    }
}
