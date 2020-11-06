package es.studium.Operaciones3;

import java.util.Scanner;

public class Operaciones3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Dime un número entero");
		num1 = teclado.nextInt();
		System.out.println("Dime otro número entero");
		num2 = teclado.nextInt();
		System.out.println("Dime otro número entero");
		num3 = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la suma es " + funSuma(num1, num2, num3));
		System.out.println("El resultado de la multiplicación es " + funProducto(num1, num2, num3));
		System.out.println("El resultado de la media es " + funMedia(num1, num2, num3));
	}
		
		
		public static int funSuma (int a, int b, int c)
		{
			int suma;
			suma= a + b + c;
			return suma;
		}
		public static int funProducto (int a, int b, int c)
		{
			int producto;
			producto= a * b * c;
			return producto;
		}
		public static float funMedia (int a, int b, int c)
		{
		float media;
		media = (funSuma(a,b,c)) / 3;
		return media;
		}
	
	}