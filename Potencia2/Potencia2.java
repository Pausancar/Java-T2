package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia2
{

	public static void main(String[] args)
	{
	Scanner teclado=new Scanner(System.in);
	int base,exponente,i;
	i=1;
	System.out.println("Dime la base");
	base=teclado.nextInt();
	System.out.println("Dime el exponente");
	exponente=teclado.nextInt();
	teclado.close();
	System.out.println(base + " elevado a " + exponente + " es igual a " + (funPotencia2(base,exponente,i)));

	}
	public static int funPotencia2 (int a, int b, int i)
	{
		int potencia;
		potencia=1;
		for (i=1;i<=b;i++)
		{
			potencia = potencia * a;
		}
		return(potencia);
	}
}
/*package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia2
{
        public static void main(String[] args)
        {
                int a, b;
                Scanner teclado = new Scanner(System.in);
                System.out.println("Dame la base:");
                a = teclado.nextInt();
                System.out.println("Dame el exponente:");
                b = teclado.nextInt();
                teclado.close();
                System.out.println("El número " + a + " elevado a " + b + " es igual a:" + pot(a,b));
        }
        public static int pot(int base, int exponente)
        {
                int i, resultado = 1;
                for(i=1;i<=exponente;i++)
                {
                        resultado = resultado * base;
                }
                return(resultado)
        }
} */
