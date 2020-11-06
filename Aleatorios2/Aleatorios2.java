package es.studium.Aleatorios2;

import java.util.Random;

public class Aleatorios2
{

	public static void main(String[] args)
	{
		Random rnd=new Random();//tenemos un objeto de la clase random, se que es un objeto porque tenemos la particula new y el constructor que es random()
		int i,x;
		for(i=0;i<10;i++)//i++ es el incremento del PARA, si no se pone tbn swria 1, si se quisera dos veces seria 1+=2
		{
		x=rnd.nextInt(1000);//con el objeto rnd sacoun num aleatroio entre 0 y 999 y ese objeto lo meto en x
		System.out.println(x);//saco x por pantalla
		}

	}

}
