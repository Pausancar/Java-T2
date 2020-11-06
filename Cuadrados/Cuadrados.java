package es.studium.Cuadrados;

public class Cuadrados
{
	public static void main(String[] args)
	{
		System.out.println("La suma de los cuadrados de los 100 primeros números es " + funCuadrado() );
	}
	public static int funCuadrado ()
	{
		int i;
		int cuadrado;
		cuadrado=0;
		for (i=1;i<=100;i++)
		{
			cuadrado= (i*i) + cuadrado;
		}
		return cuadrado;
		
	}
	
}
