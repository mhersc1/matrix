package com.intercorp.evaluation.matrix.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MatrixService {

    public void validate(int[][] matrix) {
        int numberOfRows = matrix.length;
        if(matrix.length <= 1)
            throw new RuntimeException("El tamaño mínimo permitido para una matriz cuadrada es de 2x2.");

        boolean areNotEquals = Arrays.stream(matrix).anyMatch(array -> array.length != numberOfRows);
        if (areNotEquals)
            throw new RuntimeException("El número de filas debe coincidir con el número de columnas en una matriz cuadrada.");
    }

    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
    }

    public void reverseColumns(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0, k = matrix[0].length - 1;
                 j < k; j++, k--) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
    }
}
