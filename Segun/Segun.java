package es.studium.Segun;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		int a,b;
		System.out.print("Dime un n�mero entero ");
		a=teclado.nextInt();
		System.out.print("Dime otro n�mero entero ");
		b=teclado.nextInt();
		if (a<b)
		{
			System.out.print("La suma de ambos n�meros enteros es " + (a+b));
		}
		else
		{
			System.out.print("La multiplicaci�n de ambos n�meros enteros es " + (a*b));
		}
		teclado.close();
	}
}
