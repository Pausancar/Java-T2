package es.studium.pares;

import java.util.Scanner;

public class pares {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, i;
		System.out.print("Dame un número");
		numero1 = teclado.nextInt();
		System.out.print("Dame otro número");
		numero2 = teclado.nextInt();
		teclado.close();
		for(i=numero1;i<=numero2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		teclado.close();
	}

}

/*
PROGRAMA pares
CONSTANTES
VARIABLES
	ENTERO a,b,i
INICIO
	ESCRIBE "Dime un número"
	LEER a
	ESCRIBE "Dime otro número"
	LEER b
	PARA i=a HASTA i=b
		SI i%2=0 ENTONCES
			ESCRIBIR i
			LINEANUEVA()
		FINSI
	FINPARA
FIN
*/