package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.println("Dime un número entero");
		num1 = teclado.nextInt();
		System.out.println("Dime otro número entero");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la suma es " + (num1 + num2));
		System.out.println("El resultado de la resta es " + (num1 - num2));
		System.out.println("El resultado de la multiplicación es " + (num1 * num2));
		if(num2==0)
		{
			System.out.println("No se puede dividir entre 0");
		}
		else
		{
			System.out.println("El resultado de la división es " + ((float)num1 / (float)num2));
		}

	}
	
}
