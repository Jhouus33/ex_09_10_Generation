package ex_09_10;
//Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//a 	Os n�meros pares digitados;  
//b		A soma dos n�meros pares digitados; 
//c		Os n�meros �mpares digitados; 
//d		A quantidade de n�meros �mpares digitados.

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int somaPares = 0, impares = 0, i;
		int[] A = new int[6];
		for(i = 0; i < A.length; i++) {
			System.out.println("Digite um n�mero: ");
			A[i] = input.nextInt();
			if(A[i] % 2 == 0) {
				somaPares = somaPares + A[i];
				System.out.println(A[i]+"- n�mero par!"); //a
			}else {
				System.out.println(A[i]+"- n�mero �mpar!"); //c
				impares++;
			}
		}
		System.out.println("\n Soma total dos pares: " + somaPares); //b
		System.out.println("\n Total de n�meros �mpares digitados: " + impares); //d
	}
}
