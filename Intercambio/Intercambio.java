package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		int numero1,numero2,a;
		System.out.print("Dime un número ");
		numero1=teclado.nextInt();
		System.out.print("Dime otro número ");
		numero2=teclado.nextInt();
		teclado.close();
		a=numero2;
		numero2=numero1;
		numero1=a;
		System.out.println(numero1);
		System.out.print(numero2);

	}

}
