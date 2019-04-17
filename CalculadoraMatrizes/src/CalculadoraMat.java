/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author OSMAR
 */
public class CalculadoraMat {

    private static Scanner leitor;

	public static void main(String[] args) {
        CalculadoraMatrizes calc= new CalculadoraMatrizes();
        leitor = new Scanner(System.in);
        System.out.println("Bem-vindo a Calculadora de Matrizes do Osmar!");
        System.out.println("Digite o número de linhas da Matriz 1:");
        int linhas1 = leitor.nextInt();
        System.out.println("Digite o número de colunas da Matriz 1:");
        int colunas1 = leitor.nextInt();
        System.out.println("Digite o número de linhas da Matriz 2:");
        int linhas2 = leitor.nextInt();
        System.out.println("Digite o número de colunas da Matriz 2:");
        int colunas2 = leitor.nextInt();
        double matriz1[][] = new double[linhas1][colunas1];
        double matriz2[][] = new double[linhas2][colunas2];
        System.out.println("----- PREENCHIMENTO DA MATRIZ 1 -----");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]:");
                double numero = leitor.nextInt();
                matriz1[i][j] = numero;
            }
        }
        System.out.println("----- PREENCHIMENTO DA MATRIZ 2 -----");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]:");
                int numero = leitor.nextInt();
                matriz2[i][j] = numero;
            }
        }
        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("\nDigite uma das opções:");
            System.out.println("1 - Soma de matrizes");
            System.out.println("2 - Subtração de matrizes");
            System.out.println("3 - Multiplicação de matrizes");
            System.out.println("4 - Determinante");
            System.out.println("5 - Sair");
            int opcao;
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    if (linhas1 == linhas2) {
                        double matrizSoma[][] = new double[linhas1][linhas2];
                        for (int i = 0; i < linhas1; i++) {
                            for (int j = 0; j < linhas2; j++) {
                                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
                            }
                        }
                        System.out.println("Soma das Matrizes:");
                        for (int i = 0; i < linhas1; i++) {
                            for (int j = 0; j < linhas2; j++) {

                                if (j == 0) {
                                    System.out.print("[");
                                }
                                System.out.print("  " + matrizSoma[i][j]);
                                if (j == (linhas2 - 1)) {
                                    System.out.println("  ]");
                                }
                            }
                        }
                    } else {
                        System.out.println("Matriz 1 e 2 de ordens diferentes!");
                    }
                    break;
                case 2:
                    if (linhas1 == linhas2) {
                        double matrizSub[][] = new double[linhas1][linhas2];
                        for (int i = 0; i < linhas1; i++) {
                            for (int j = 0; j < linhas2; j++) {
                                matrizSub[i][j] = matriz1[i][j] - matriz2[i][j];
                            }
                        }
                        System.out.println("Subtração das Matrizes:");
                        for (int i = 0; i < linhas1; i++) {
                            for (int j = 0; j < linhas2; j++) {
                                if (j == 0) {
                                    System.out.print("[");
                                }
                                System.out.print("  " + matrizSub[i][j]);
                                if (j == (linhas2 - 1)) {
                                    System.out.println("  ]");
                                }
                            }
                        }
                    } else {
                        System.out.println("Matriz 1 e 2 de ordens diferentes!");
                    }
                    break;
                case 3:
                    if (colunas1 == linhas2) {
                        double matrizMult[][] = new double[linhas1][linhas2];
                        for (int i = 0; i < linhas1; i++) {
                            for (int j = 0; j < linhas2; j++) {
                                double somador = 0;
                                for (int k = 0; k < linhas2; k++) {
                                    somador += matriz1[i][k] * matriz2[k][j];
                                }
                                matrizMult[i][j] = somador;
                            }
                        }
                        System.out.println("Multipicação das Matrizes:");
                        for (int i = 0; i < linhas1; i++) {
                            for (int j = 0; j < linhas2; j++) {
                                if (j == 0) {
                                    System.out.print("[");
                                }
                                System.out.print("  " + matrizMult[i][j]);
                                if (j == (linhas2 - 1)) {
                                    System.out.println("  ]");
                                }
                            }
                        }
                    } else {
                        System.out.println("Matriz 1 e 2 de ordens diferentes!");
                    }
                    break;
                case 4:
                    System.out.println("Qual matriz deseja calcular o determinante?");
                    System.out.println("1- Matriz 1");
                    System.out.println("2- Matriz 2");
                    int op = leitor.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Determinante: " + calc.deter(0, matriz1));
                            break;
                        case 2:
                            System.out.println("Determinante: " + calc.deter(0, matriz2));
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Obrigado por usar a calculadora do Osmar!");
                    System.exit(0);
            }
            System.out.println("Pressione ENTER para continuar...");
            leitor.nextLine();
            leitor.nextLine();
        }

    }
    


   

}
