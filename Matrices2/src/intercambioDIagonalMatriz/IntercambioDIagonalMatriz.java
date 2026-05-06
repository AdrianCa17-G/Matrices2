/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intercambioDIagonalMatriz;

/**
 *
 * @author SALASC
 */
public class IntercambioDIagonalMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz2 = {{2, 4, 5, 7}, {3, 1, 20, 13}, {9, 11, 21, 19}, {6, 40, 2, 50}};
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

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2[i].length; j++) {
                if (i > j) {
                    matrizIntercambiada[i][j] = matriz2[j][i];
                } else {
                    matrizIntercambiada[i][j] = 0;
                }
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
