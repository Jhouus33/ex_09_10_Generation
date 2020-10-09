package ex_09_10;
//Faça um programa que receba 6 números inteiros e mostre: 
//a 	Os números pares digitados;  
//b		A soma dos números pares digitados; 
//c		Os números ímpares digitados; 
//d		A quantidade de números ímpares digitados.

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int somaPares = 0, impares = 0, i;
		int[] A = new int[6];
		for(i = 0; i < A.length; i++) {
			System.out.println("Digite um número: ");
			A[i] = input.nextInt();
			if(A[i] % 2 == 0) {
				somaPares = somaPares + A[i];
				System.out.println(A[i]+"- número par!"); //a
			}else {
				System.out.println(A[i]+"- número ímpar!"); //c
				impares++;
			}
		}
		System.out.println("\n Soma total dos pares: " + somaPares); //b
		System.out.println("\n Total de números ímpares digitados: " + impares); //d
	}
}
