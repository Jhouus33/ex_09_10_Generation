package ex_09_10;


//	Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
//	(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//	(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
//	(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
//	(d) Mostre na tela cada valor do vetor A, um em cada linha.


import java.util.Scanner;

public class ex1 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		// long[] A = new long[6];
		int[] A = {1, 0, 5, -2, -5, 7}; //a
		
		soma = soma + A[0] + A[1] + A[5];
		System.out.println(soma);		//b
		
		A[4] = 100; // c
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]); // d - { 1, 0, 5, -2, 100, 7} 
		}
	}
}		
