package es.studium.Compara;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in); //Scanner (después del =) es el constructor del objeto teclado de la clase scanner, el constructor tiene el mismo nombre que la clase
		int numero1,numero2;
		System.out.print("Dime un número "); //system es una clase, out es un objeto que es la consola y println es un metodo que es una funcion. 
		numero1=teclado.nextInt();
		System.out.print("Dime otro número ");
		numero2=teclado.nextInt();
		teclado.close();
		if (numero1==numero2)
		{
			System.out.print(numero1 + " es igual que " + numero2); //si se pone syso y se pulsa ctrl + espacio pone eso
		}
		else
		{
			if (numero1>numero2)
			{
				System.out.print(numero1 + " es mayor que " + numero2);
			}
			else
			{
				System.out.print(numero1 + " es menor que " + numero2);
			}
		
		}	
		}

}
