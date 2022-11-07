package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). 
		 * Para ello se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”, según sea mayor o menor 
		 * con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).
		 */

		// variables
		Scanner scan = new Scanner (System.in);
		int num=0, numAleatorio;
		
		//while
		
		System.out.println("Adivina el número aleatorio del 1 al 100");
		numAleatorio = (int) ((Math.random() * (101 - 1)) + 1);
		
		while (num>=0 || num == numAleatorio) {
			System.out.println("Introduce un número que creas que pueda ser el número aleatorio: (-1 para rendirte)");
			num = scan.nextInt();
			if (num > numAleatorio) {
				System.out.println("El número aleatorio es menor que tu número");
			}
			else if (num < numAleatorio) {
				System.out.println("El número aleatorio es mayor que tu número");
			}
		}
		
		if (num==-1) {
			System.out.println("Te has rendido");
		}
		else {
			System.out.println("Has acertado!!");
		}
		

	}

}
