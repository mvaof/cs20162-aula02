package com.github.mvaof.aula02;

import java.util.Scanner;
//Importado de java.lang.Object para entrada de dados

public class Soma {
// Classe que soma todos os números maiores que 0 até n (que é inserido pelo usuário)

	public int somaNaturais(int n) {

		int i = 2;
		int s = 1;

		if (n >= 1) {

			while (i <= n) {
				s += i;
				i++;
			}

		} else {
			throw new IllegalArgumentException("Não é permitido número negativo!");
		}
		return s;

	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Soma soma = new Soma();
		System.out.println("Entre com a quantidade de números");

		int numero = Integer.parseInt(leitor.nextLine());

		try {
			System.out.println(soma.somaNaturais(numero));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
