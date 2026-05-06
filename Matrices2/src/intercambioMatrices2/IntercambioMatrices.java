/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intercambioMatrices2;

/**
 *
 * @author SALASC
 */
public class IntercambioMatrices {

    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz2 = {{12, 45, 8, 11}, {56, 7, 33, 97}, {9, 11, 22, 36}, {14, 31, 54, 6}};
        int[][] matrizIntercambiada = new int[4][4];

        presentacionMatrizOriginal(matriz2);

        matrizIntercambiada = intercambiarValores(matriz2, matrizIntercambiada);
        presentacionMatrizIntercmbiada(matrizIntercambiada);
    }

    public static void presentacionMatrizOriginal(int[][] matriz2) {

        System.out.println("Presentacion de la matriz original");

        for (int i = 0; i < matriz2.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static int[][] intercambiarValores(int[][] matriz2, int[][] matrizIntercambiada) {

        int n = matriz2.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrizIntercambiada[i][j] = matriz2[n - 1 - i][n - 1 - j];

            }
        }

        return matrizIntercambiada;

    }

    public static void presentacionMatrizIntercmbiada(int[][] matrizIntercambiada) {

        System.out.println("Presentacion de la matriz intercambiada");

        for (int i = 0; i < matrizIntercambiada.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrizIntercambiada[i].length; j++) {
                System.out.print(matrizIntercambiada[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

}
