package ejercicioswhile;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. 
		 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
		 * antes de acabar, mostrará la media de los números positivos introducidos por el usuario.
		 */
		
		// variables
		Scanner scan = new Scanner(System.in); //iniciar escáner
		int num, media; //numeros
		
		//introducir datos
		System.out.println("Introduce un número positivo: "); //pedir numero positivo
		num = scan.nextInt(); //guardar numero positivo
		
		//while
		while (num>0) {
			System.out.println("Introduce otro número positivo y cuando quieras finalizar el programa introduce un numero negativo");
			num = scan.nextInt();
		}
		
		media = (num+num)/num;
		
		System.out.println("Has salido del programa");
		System.out.println("Media de números positivos introducidos: " + media);
		

	}

}
