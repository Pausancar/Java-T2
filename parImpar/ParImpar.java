package es.studium.parImpar;

import java.util.Scanner;

public class ParImpar
{
	public static void main(String[] args) 
	{	
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		if(numero%2==0)
		{
			System.out.println("El número es PAR");
		}
		else
		{
			System.out.println("El número es IMPAR");
		}
		teclado.close();
	}
}

/*PROGRAMA parImpar
CONSTANTES
VARIABLES
	ENTERO a
INICIO
	ESCRIBIR "Dime un número"
	LEER a
	SI a%2=0 ENTONCES
		ESCRIBIR "El número es par"
	SINO
		ESCRIBIR "El número es impar"
	FINSI
FIN*/