package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. 
		 * Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, 
		 * la media, el número de alumnos y cuántos son mayores de edad.
		 */
		
		// variables
		Scanner scan = new Scanner (System.in);
		int edad=0, contador=0, suma=0, media=0, contMayor=0;
		
		//while
		while (edad>=0) {
			System.out.println("Introduce la edad del alumno (si quieres salir del programa introduce un número negativo)");
			edad = scan.nextInt();
			if(edad>=0) {
			
				contador++;
				suma = suma + edad; //calcular la suma
				media = (media + edad)/contador; //calcular la media
				if (edad >= 18) {
					contMayor++;
				}
			}
		}
		
		System.out.println("La suma de todas las edades introducidas es: " + suma);
		System.out.println("La media de todas las edades introducidas es: " + media);
		System.out.println("El número de alumnos mayores de edad es de: " + contMayor);


	}

}
