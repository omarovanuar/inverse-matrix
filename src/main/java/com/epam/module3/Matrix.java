package com.epam.module3;

import java.util.Random;

public class Matrix {
    private int size;
    private double value[][];

    public Matrix(int size) {
        this.size = size;
        value = new double[size][size];
    }

    public double[][] fillMatrix() {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                value[i][j] = rnd.nextInt(10);
            }
        }
        return value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double[][] getValue() {
        return value;
    }

    public void setValue(double[][] value) {
        this.value = value;
    }
}
