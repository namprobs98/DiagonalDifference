/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagonaldifference;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class DiagonalDifference {

    /**
     * @param args the command line arguments
     */
    public static int diagonalDifference(int[][] matrix) {
        int leftToRight = 0;
        int rightToLeft = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    leftToRight += matrix[i][j];
                }
                if (i == n - 1 - j) {
                    rightToLeft += matrix[i][j];
                }
            }
        }
        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalDifference(matrix));
    }

}
