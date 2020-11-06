package es.studium.Potencia;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		int base,exponente,i,resultado;
		System.out.print("Dime la base ");
		base=teclado.nextInt();
		teclado.close();
		System.out.print("Dime el exponente ");
		exponente=teclado.nextInt();
		resultado=1;
		for (i=1;i<=exponente;i++) //si quiero incrementar 2 sería i+=2
		{
			resultado=resultado*base;
		}
		System.out.print(base + " elevado a " + exponente + " es igual a " + resultado);
		teclado.close();
	} 
}