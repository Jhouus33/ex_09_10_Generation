package ex_09_10;

//	Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//	(1) somar as duas matrizes 
//	(2) subtrair a primeira matriz da segunda 
//	(3) adicionar uma constante as duas matrizes
//	(4) imprimir as matrizes 


import java.util.Scanner;

public class ex4 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int[][] matrizUm = new int[2][2];
		int[][] matrizDois = new int[2][2];
		
		int somaMatrizUm = 0, somaMatrizDois = 0;
		
		for(int linha=0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matrizUm[linha][coluna] = input.nextInt();
				somaMatrizUm = somaMatrizUm + matrizUm[linha][coluna];
								
			}
		}
		
		for(int linha=0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matrizDois[linha][coluna] = input.nextInt();
				somaMatrizDois = somaMatrizDois + matrizDois[linha][coluna];
				
			}
		}
	}
}
