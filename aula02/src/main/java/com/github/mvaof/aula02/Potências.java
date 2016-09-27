/**
 * Implementação do cálculo de potência através de produto.
 * @author Marcus
 */
package com.github.mvaof.aula02;

public class Potências {
/**
 * Obtém cálculo de potência.
 * @param x A base da potência. Valor maior ou igual a 0.
 * @param y O expoente da potência. Valor maior ou igual a 0.
 * @return O valor da potência de x elevado a y.
 * @throws IllegalArgumentException Se x ou y for menor ou igual a 0.
 */
	public static int potencia(int x, int y) throws IllegalArgumentException{

		int potencia = 1;

		if (x <= 0 && y <= 0) {
			throw new IllegalArgumentException("Não é permitido número negativo!");
		}
		int i = 1;
		while (i <= y) {
			potencia = Produto.produto(potencia, x);
			i++;
		}

		return potencia;

	}
}