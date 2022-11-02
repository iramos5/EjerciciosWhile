package ejercicioswhile;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. 
		 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
		 * antes de acabar, mostrará la suma de los números positivos introducidos por el usuario.
		 */
		
		// variables
		Scanner scan = new Scanner (System.in); //iniciar escáner
		int num1, num2, suma, suma2; //numeros que va introduciendo el usuario

		// pedir primeros números
		System.out.println("Introduce un número positivo: "); //pedir al usuario que introduzca el primer numero a sumar
		num1= scan.nextInt(); //guardar primer numero
		System.out.println("Introduce otro número positivo: "); //pedir al usuario que introduzca el segundo numero
		num2= scan.nextInt(); //guardar segundo numero
		
		//sumas
		while(num1 >= 0 && num2 >=0) {
			suma = num1+num2;
			System.out.println(num1 + " + " + num2 + " = " + suma);
			System.out.println("Introduce otro numero positivo para sumar, si quieres salir del programa introduce un numero negativo: ");
			num1 = scan.nextInt();
			suma2 = suma + num1;
			System.out.println(suma + " + " + num1 + " = " + suma2);
			
		}
		
		System.out.println("Has introducido un número negativo, sales del programa");
		
		
		scan.close(); //cerrar escáner
	}

}
