package es.studium.Expresion;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a,b,c;
		System.out.println("Dime a");
		a = teclado.nextInt();
		System.out.println("Dime b");
		b = teclado.nextInt();
		System.out.println("Dime c");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de esta expresión es " + funExpresion(a,b,c));

	}
	public static float funExpresion (int a, int b, int c)
	{
		float expresion;
		expresion = (((float)b*(float)b) - (4*(float)a*(float)c))/(2*(float)a);
		return (expresion);
	}
	
	
}
