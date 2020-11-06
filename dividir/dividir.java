package es.studium.dividir;

import java.util.Scanner;

public class dividir {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int numerador, denominador;
		float resultado;
		System.out.println("Dame un número ");
		numerador = teclado.nextInt();
		System.out.println("Dame otro número ");
		denominador = teclado.nextInt();
		resultado=fundividir(numerador, denominador);
		System.out.println ("El resultado es" + resultado);
		teclado.close();
	}
	public static float fundividir(int a, int b) //float es lo que devuelve y entre paresntesis los parametros static lo veremos mas adelanteEsta es nuestra funcion
	{
		float resultado;
		resultado= a/b;//a y b se desfrazan de float, aunque sigan siendo enteros, este es el casting
		return(resultado);
	}
}

