/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smallestvalueofraggedarray;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class SmallestValueofRaggedArray {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter the size of rows in the ragged matrix: ");
        int rowSize = input.nextInt();

        int[][] raggedMatrix = fillRaggedMatrix(rowSize);

        System.out.println("The min value is: " + getSmallest(raggedMatrix));

    }

    public static int[][] fillRaggedMatrix(int rowSize) {

        int[][] raggedMatrix = new int[rowSize][];

        int columnSize;

        for (int i = 0; i < raggedMatrix.length; i++) {
            System.out.println("Please enter the number of columns in row " + (i + 1) + ": ");
            columnSize = input.nextInt();
            raggedMatrix[i] = new int[columnSize];
        }

        for (int i = 0; i < raggedMatrix.length; i++) {
            for (int j = 0; j < raggedMatrix[i].length; j++) {
                System.out.println("Please enter the value of item in row " + (i + 1) + " and column " + (j + 1) + ": ");
                raggedMatrix[i][j] = input.nextInt();
            }
        }
        return raggedMatrix;
    }

    public static int getSmallest(int[][] raggedMatrix) {
        int min = raggedMatrix[0][0];

        for (int i = 0; i < raggedMatrix.length; i++) {
            for (int j = 0; j < raggedMatrix[i].length; j++) {
                if (raggedMatrix[i][j] < min) {
                    min = raggedMatrix[i][j];
                }
            }
        }
        return min;
    }

}
