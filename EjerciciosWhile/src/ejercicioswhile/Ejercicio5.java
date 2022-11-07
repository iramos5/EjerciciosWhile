package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero). 
		 * Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, 
		 * la media de los números negativos y el número de ceros que ha introducido el usuario.
		 */

		//variables
		Scanner scan = new Scanner (System.in);
		int contador=0, num, positivos = 0, contNeg = 0, negativos=0, contCero=0;
		
		//while
		while (contador<10) {
			System.out.println("Introduce un número entero: ");
			num = scan.nextInt();
			contador ++;
			if(num>0) {
				positivos = positivos+num;
			}
			if(num<0) {
				contNeg ++;
				negativos = (negativos+num)/contNeg;
			}
			if(num==0) {
				contCero ++;
			}
		}
		
		// suma de numeros positivos
		System.out.println("La suma de los numeros positivos da: " + positivos);
		
		// media de numeros negativos
		System.out.println("La media de los números negativos da: " + negativos);
		
		// numero de ceros
		System.out.println("El número de ceros introducido es: " + contCero);
		
		// cierre escaner
		scan.close();
	}

}
