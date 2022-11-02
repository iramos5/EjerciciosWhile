package ejercicioswhile;
import java.util.Scanner;

/* Pruebas: 
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando. 
		 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes de acabar, 
		 * mostrará la cantidad de números positivos introducidos por el usuario.
		 */
		
		// variables
		Scanner scan = new Scanner(System.in); // abre escáner
		int num1, contar=0; //num1 es los numeros que va metiendo el usuario y contar es el contador de la cantidad de numeros introducidos
		
		
		// introducir numero
		System.out.println("Introduce un número positivo: "); //pedir numero positivo
		num1 = scan.nextInt(); //guardar numero positivo
		
		// while
		while (num1>=0) { // mientras el numero sea positivo
			contar++; // se añade 1 al contador
			System.out.println("Introduce un número positivo (o negativo si quieres terminar): "); //pedir introducir mas numeros
			num1 = scan.nextInt(); //guardar numero nuevo
		}
		
		System.out.println("Has introducido " + contar + " números positivos"); // resultado del contador
		
		scan.close(); // cierre escaner


	}

}
