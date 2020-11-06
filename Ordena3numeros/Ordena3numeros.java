package es.studium.Ordena3numeros;

import java.util.Scanner;

public class Ordena3numeros
{

	public static void main(String[] args)
	{
	Scanner teclado = new Scanner(System.in);
	int a, b, c;
	System.out.println("Dime un número");
	a = teclado.nextInt();
	System.out.println("Dime otro número");
	b = teclado.nextInt();
	System.out.println("Dime otro número");
	c = teclado.nextInt();
	teclado.close();
	if(a<b && b<c)
	{
		System.out.print(a + ","+ b +"," + ","+ c );	
		//System.out.print(b);
		//System.out.print(c);
	}
	else if(a<b && c<b)
	{
		System.out.print(a);	
		System.out.print(c);
		System.out.print(b);
	}
	else if(c<b && b<a)
	{
		System.out.print(c);	
		System.out.print(b);
		System.out.print(a);	
	}
	else if(c<b && a<b)
	{
		System.out.print(c);	
		System.out.print(a);
		System.out.print(b);
	}
	else if(b<c && c<a)
	{
		System.out.print(b);	
		System.out.print(c);
		System.out.print(a);	
	}
	else if(b<a && a<c)
	{
		System.out.print(b);	
		System.out.print(a);
		System.out.print(c);	
	}
	}

}
