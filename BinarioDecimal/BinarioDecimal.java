package es.studium.BinarioDecimal;

import java.util.Scanner;

public class BinarioDecimal
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3, num4, num5;
		System.out.println("Dime un número");
		num1 = teclado.nextInt();
		if (num1 != 1 && num1!=0)
		{
			System.out.println("Tiene que ser 1 o 0, vuelve a escribirlo");
			num1=teclado.nextInt();
		}
		System.out.println("Dime un número");
		num2 = teclado.nextInt();
		if (num2 != 1 && num1!=0)
		{
			System.out.println("Tiene que ser 1 o 0, vuelve a escribirlo");
			num2=teclado.nextInt();
		}
		System.out.println("Dime un número");
		num3 = teclado.nextInt();
		if (num3 != 1 && num3!=0)
		{
			System.out.println("Tiene que ser 1 o 0, vuelve a escribirlo");
			num3=teclado.nextInt();
		}
		System.out.println("Dime un número");
		num4 = teclado.nextInt();
		if (num4 != 1 && num4!=0)
		{
			System.out.println("Tiene que ser 1 o 0, vuelve a escribirlo");
			num1=teclado.nextInt();
		}
		System.out.println("Dime un número");
		num5 = teclado.nextInt();
		if (num5 != 1 && num5!=0)
		{
			System.out.println("Tiene que ser 1 o 0, vuelve a escribirlo");
			num1=teclado.nextInt();
		}
		teclado.close();
		System.out.println("Este binario equivale al decimal " + funBinario(num1,num2,num3,num4,num5));
		
		

	}
	public static int funBinario (int num1, int num2, int num3, int num4, int num5)
	{
		int decimal;
		decimal = num5 * 1 + num4 * 2 + num3 *2*2 + num2*2*2*2 + num1 *2*2*2*2;
		return decimal;
	}
}
