package es.studium.Veces;

import java.util.Scanner;

public class Veces
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		int numero1,numero2,i;
		System.out.print("Dime un número ");
		numero1=teclado.nextInt();
		System.out.print("Dime otro número ");
		numero2=teclado.nextInt();
		teclado.close();
		for(i=1;i<=numero1;i++)
		{
			System.out.println( numero2 );
		}
	}

}
