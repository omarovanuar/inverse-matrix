package com.epam.module3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try {
            Matrix matrix = new Matrix(3);
            matrix.fillMatrix();
            Utils.matrixShow(matrix);
            double determinant = Utils.calculateDeterminant(matrix);
            System.out.println("Determinant of matrix is: " + determinant);
            if (determinant == 0) {
                System.out.println("determinant can't be 0 for return matrix");
            } else {
                Matrix returnMatrix = Utils.calculateReturnMatrix(matrix, determinant);
                Utils.matrixShow(returnMatrix);
            }
        } catch (Exception e) {
            System.out.println("Something is going wrong");
            e.printStackTrace();
        }
    }
}
