//Materia: Estructura de datos 
//Tema: 2
//Programa: U2_3 Factorial R
//Alumno: Jose Luis Sanchez Reyna
//Fecha: 19/09/2024

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Ingrese el numero para aplicar factorial"); 
		int n = entrada.nextInt(); 
		
		int factorial = factorial(n); 
		
		System.out.println(n + "! = " + factorial); 
		
		long memtotal = Runtime.getRuntime().totalMemory(); 
		long memlibre = Runtime.getRuntime().freeMemory(); 
		long memConsume = memtotal - memlibre; 
		
		System.out.println("La memoria consumida es: " + memConsume + " bits. "); 

	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else 
			return n * factorial(n - 1); 
	}

}
