package ex_09_10;
//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

import java.util.Scanner;

public class ex3 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int maiorQ10 = 0;
		
		for(int linha=0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matriz[linha][coluna] = input.nextInt();
				if(matriz[linha][coluna] > 10) {
					maiorQ10 = maiorQ10 + 1;					
				}
			}
		}
		System.out.println("Na matriz foram digitados " + maiorQ10 + " elementos com valor maior que 10."); 
	}
}
