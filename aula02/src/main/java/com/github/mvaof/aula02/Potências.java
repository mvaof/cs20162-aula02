/**
 * Implementa��o do c�lculo de pot�ncia atrav�s de produto.
 * @author Marcus
 */
package com.github.mvaof.aula02;

public class Pot�ncias {
/**
 * Obt�m c�lculo de pot�ncia.
 * @param x A base da pot�ncia. Valor maior ou igual a 0.
 * @param y O expoente da pot�ncia. Valor maior ou igual a 0.
 * @return O valor da pot�ncia de x elevado a y.
 * @throws IllegalArgumentException Se x ou y for menor ou igual a 0.
 */
	public static int potencia(int x, int y) throws IllegalArgumentException{

		int potencia = 1;

		if (x <= 0 && y <= 0) {
			throw new IllegalArgumentException("N�o � permitido n�mero negativo!");
		}
		int i = 1;
		while (i <= y) {
			potencia = Produto.produto(potencia, x);
			i++;
		}

		return potencia;

	}
}