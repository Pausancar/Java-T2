package es.studium.parImpar;

import java.util.Scanner;

public class ParImpar
{
	public static void main(String[] args) 
	{	
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		if(numero%2==0)
		{
			System.out.println("El n�mero es PAR");
		}
		else
		{
			System.out.println("El n�mero es IMPAR");
		}
		teclado.close();
	}
}

/*PROGRAMA parImpar
CONSTANTES
VARIABLES
	ENTERO a
INICIO
	ESCRIBIR "Dime un n�mero"
	LEER a
	SI a%2=0 ENTONCES
		ESCRIBIR "El n�mero es par"
	SINO
		ESCRIBIR "El n�mero es impar"
	FINSI
FIN*/