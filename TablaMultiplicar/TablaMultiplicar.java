package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int numero,i, resultado;
		System.out.println("Dame un número ");
		numero = teclado.nextInt();
		teclado.close();
		for (i=1;i<=10;i++)
		{
			resultado = numero*i;
			System.out.println(numero + "x" +  i + "=" + numero*i);	
		}	
	}
}
