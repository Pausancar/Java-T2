package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2
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
		System.out.println("El resultado de la suma es " + funSuma(num1, num2));
		System.out.println("El resultado de la resta es " + funResta(num1, num2));
		System.out.println("El resultado de la multiplicación es " + funProducto(num1, num2));
		if(num2==0)
			{
				System.out.println("No se puede dividir entre 0");
			}
		else
			{
				System.out.println("El resultado de la división es " + funDividir(num1, num2));
			}

		}
		public static int funSuma (int a, int b)
		{
			int suma;
			suma= a + b;
			return suma;
		}
		public static int funResta (int a, int b)
		{
			int resta;
			resta= a - b;
			return resta;
		}
		public static int funProducto (int a, int b)
		{
			int producto;
			producto= a * b;
			return producto;
		}
		public static float funDividir (int a, int b)
		{
		float dividir;
		dividir= (float)a / (float)b;
		return dividir;
		}
	}