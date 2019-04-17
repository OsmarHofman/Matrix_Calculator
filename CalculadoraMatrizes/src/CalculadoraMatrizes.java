/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OSMAR
 */
public class CalculadoraMatrizes {

    /**
     * @param args the command line arguments
     */
    
    private int matriz1[][];
    private int matriz2[][];

    public int[][] getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(int[][] matriz2) {
        this.matriz2 = matriz2;
    }

    public void setMatriz1(int[][] matriz1){
        this.matriz1 = matriz1;
    }
    
    public int[][] getMatriz1() {
        return matriz1;
    }

    public void setMatriz1LinCol(int linha, int coluna) {
        this.matriz1 = new int[linha][coluna];
    }
    
    public void setMatriz2LinCol(int linha, int coluna) {
        this.matriz2 = new int[linha][coluna];
    }
    
        //Métodos
    public double deter(int linha, double matriz[][]) {
        switch (matriz.length) {
            case 1:
                return matriz[0][0];
            case 2:
                return ((matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]));
            case 3:
                return (((matriz[0][0] * matriz[1][1] * matriz[2][2]) + 
                        (matriz[0][1]* matriz[1][2]* matriz[2][0]) +
                        (matriz[0][2]* matriz[1][0]* matriz[2][1])) - 
                        ((matriz[2][0] * matriz[1][1] * matriz[0][2])+
                        (matriz[2][1] * matriz[1][2] * matriz[0][0])+
                        (matriz[2][2] * matriz[1][0]) * matriz[0][1]));
            default:
                double deter = 0;
                for (int coluna = 0; coluna < matriz.length; coluna++) {
                    double[][] aux = this.subMatriz(linha, coluna, matriz);
                    deter = deter + Math.pow(-1, linha + coluna) * matriz[linha][coluna] * this.deter(linha, aux);
                }
                return deter;
        }

    }
    
     private double[][] subMatriz(int linha, int coluna, double[][] matriz) {
        double[][] aux = new double[matriz.length - 1][matriz.length - 1];
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i != linha) {
                count2 = 0;
                for (int j = 0; j < matriz.length; j++) {
                    if (j != coluna) {
                        aux[count][count2] = matriz[i][j];
                        count2++;
                    }

                }
                count++;

            }

        }
        return aux;

    }
    
    
}
