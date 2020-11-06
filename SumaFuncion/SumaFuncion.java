package es.studium.SumaFuncion;

import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args) //es void porque no devuelve nada, en la funcion no esta void
	{
		Scanner teclado = new Scanner(System.in);
		int numero1,numero2, resultado;
		System.out.println("Dame un número ");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número ");
		numero2 = teclado.nextInt();
		resultado = sumarfun(numero1, numero2);
		System.out.println ("El resultado es " + resultado);
		teclado.close();
	}
	public static int sumarfun(int a, int b) //sumarfun es un metodo, que sea public quiere decir que lo podemos usar desde fuera de la clase SumaFuncion
	{
		int resultado;
		resultado= a + b;
		return(resultado);
	}
}

