package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.println("Dime un n�mero entero");
		num1 = teclado.nextInt();
		System.out.println("Dime otro n�mero entero");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la suma es " + (num1 + num2));
		System.out.println("El resultado de la resta es " + (num1 - num2));
		System.out.println("El resultado de la multiplicaci�n es " + (num1 * num2));
		if(num2==0)
		{
			System.out.println("No se puede dividir entre 0");
		}
		else
		{
			System.out.println("El resultado de la divisi�n es " + ((float)num1 / (float)num2));
		}

	}
	
}
