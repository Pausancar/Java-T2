package es.studium.suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // se crea una variable teclado de clase Scanner usando el constructor scanner (new es el constructor)
		int numero1, numero2, suma;
		System.out.println("Dame un número ");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número ");
		numero2 = teclado.nextInt();
		suma = numero1 + numero2;
		System.out.print("La suma de ambos numeros es " + suma);
		teclado.close();
	}

}
