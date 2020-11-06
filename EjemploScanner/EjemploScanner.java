/*package es.studium.EjemploScanner;

import java.util.Scanner;

public class EjemploScanner
{
	public static void main(String[] args)
	{
		// Creamos el objeto de la clase Scanner conectado al teclado
		Scanner teclado = new Scanner(System.in);
		//variables, tipos de variables int,char,float,double,boolean etc. En este caso stiring como no existe el tipo basico string por lo que string es una clase por eos empieza la primera letra en mayúscula.
		int opcion = 0, numero; 
		String frase="";
		do
		{
			System.out.println("\nMenú\n");//la \n es un salto de linea dentro de la cadena
			System.out.println("(1) - Hacer algo");
			System.out.println("(2) - Salir");
			System.out.print("Por favor, elija una opción:");
			opcion = teclado.nextInt(); // Lectura de un entero //teclado registra todo a lo que le damos, hemos marcado 1 y le hemos dado a intro, el next in ha sacado el 1 de teclado pero sigue el enter
			if(opcion==1)
			{
				System.out.print("Escribir una frase:");
				frase = teclado.nextLine(); // Lectura de una cadena // en este momento saco lo que queda en teclado por eso escribiria escribir una frase:escribir un numero
				System.out.print("Escribir un número:");
				numero = teclado.nextInt(); // Lectura de un entero
				System.out.println("\nTu frase es:\t" + frase);
				System.out.println("Tu número:\t" + numero); 
			}
		}while(opcion!=2); //mientras que el usuario marque una opcion distinta de 2 osea el 1 sigo haciendo lo del do cuando ponga dos se acaba el bucle porque hay que salir
		System.out.println("Saliendo...");
		// Cerramos el objeto teclado
		teclado.close();
	}
}*/
package es.studium.EjemploScanner;

import java.util.Scanner;

public class EjemploScanner
{
	public static void main(String[] args)
	{
		// Creamos el objeto de la clase Scanner conectado al teclado
		Scanner teclado = new Scanner(System.in);
		//variables, tipos de variables int,char,float,double,boolean etc. En este caso stiring como no existe el tipo basico string por lo que string es una clase por eos empieza la primera letra en mayúscula.
		int opcion = 0, numero; 
		String frase="";
		do
		{
			System.out.println("\nMenú\n");//la \n es un salto de linea dentro de la cadena
			System.out.println("(1) - Hacer algo");
			System.out.println("(2) - Salir");
			System.out.print("Por favor, elija una opción:");
			opcion = Integer.parseInt(teclado.nextLine()); //cambio el nextIn a nextLine para que coja una cadena, al principio da error porque opcion es un entero y en un entero no se puede meter una cadena (no se puede hacer un casting porque teclado.nextline no es una variable es un objeto. A opcion = teclado.nextLine(), parseamos el objeto taclado.. para que lo lea como un entero 
			if(opcion==1)
			{
				System.out.print("Escribir una frase:");
				frase = teclado.nextLine(); // Lectura de una cadena // en este momento saco lo que queda en teclado por eso escribiria escribir una frase:escribir un numero
				System.out.print("Escribir un número:");
				numero = Integer.parseInt(teclado.nextLine()); // Lectura de un entero, me pasa lo mismo que en la linea 55
				System.out.println("\nTu frase es:\t" + frase);
				System.out.println("Tu número:\t" + numero); 
			}
		}while(opcion!=2); //mientras que el usuario marque una opcion distinta de 2 osea el 1 sigo haciendo lo del do cuando ponga dos se acaba el bucle porque hay que salir
		System.out.println("Saliendo...");
		// Cerramos el objeto teclado
		teclado.close();
	}
}

