package br.com.bruno;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int inicio = 1;

		switch (inicio) {
		case 1:
			// entrada 1 1 2 3 0
			PrimeiroCaso(5, 2, entrada);
			break;
		case 2:
			// entrada 1 1 1 1 1
			SegundoCaso(4, 3, entrada);
		default:
			break;
		}
	}

	private static void SegundoCaso(int n, int s, Scanner entrada) {
		// entrada 1 1 2 3 0
		// Write a program that takes two integers N, S
		int maiorElemento = 0;
		// array of N integers as input.

		int arrayOfNumber[] = new int[5];
		for (int i = 0; i < arrayOfNumber.length; i++) {
			System.out.println("Indice do array : " + i);

			arrayOfNumber[i] = entrada.nextInt();

		}

		// Your program should output the size of the largest sub-array whose sum is
		// equal to S.
		int[] subArray = Arrays.copyOfRange(arrayOfNumber, 0, arrayOfNumber.length);

		for (int i = 0; i < subArray.length; i++) {
			if (subArray[i] > maiorElemento) {
				maiorElemento = subArray[i] + s - 1;
			}
		}
		System.out.println("the bigest element : " + maiorElemento);
		System.out.println("");
	}

	private static void PrimeiroCaso(int n, int s, Scanner entrada) {
		// entrada 1 1 2 3 0
		// Write a program that takes two integers N, S
		int maiorElemento = 0;
		// array of N integers as input.

		int arrayOfNumber[] = new int[5];
		for (int i = 0; i < arrayOfNumber.length; i++) {
			System.out.println("Indice do array : " + i);
			arrayOfNumber[i] = entrada.nextInt();
		}
		// Your program should output the size of the largest sub-array whose sum is
		// equal to S.
		int[] subArray = Arrays.copyOfRange(arrayOfNumber, 0, arrayOfNumber.length);

		for (int i = 0; i < subArray.length; i++) {
			if (subArray[i] > maiorElemento) {
				maiorElemento = subArray[i] + s;
			}
		}
		System.out.println("the bigest element : " + maiorElemento);
		System.out.println("");

		// Sub-array whose sum is equal to S
		maiorElemento = maiorElemento + s;
		System.out.println(maiorElemento / s);

	}

}