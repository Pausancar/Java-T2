package es.studium.TiposTriangulos;

import java.util.Scanner;

public class TiposTriangulos
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int lado1, lado2, lado3;
		System.out.println("Dime cuanto mide un lado");
		lado1 = teclado.nextInt();
		System.out.println("Dime cuanto mide otro lado");
		lado2 = teclado.nextInt();
		System.out.println("Dime cuanto mide otro lado");
		lado3 = teclado.nextInt();
		teclado.close();
		if(lado1!=lado2 && lado1!=lado3 && lado3!=lado2)
		{
			System.out.println("El tri�ngulo es escaleno");
		}
		else
			if (lado1 == lado2 && lado1 == lado3 && lado2==lado3)
			{
				System.out.println("El tri�ngulo es equil�tero");
			}
			else
			{
				System.out.println("El tri�ngulo es is�sceles");
			}
			
		}
		
}
