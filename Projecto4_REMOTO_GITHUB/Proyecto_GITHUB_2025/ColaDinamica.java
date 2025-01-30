/*
 * Materia: Estructura de datos
 * Actividad: U3_8_cola_dinámica
 * Alumno: Jose Luis Sánchez Reyna
 * Fecha: 18/10/2024
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ColaDinamica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		boolean trigger = false; 
		
		Queue<String> cola = new LinkedList<>(); 
		
		while(trigger == false) {
			System.out.println("------------------------------------"); 
			System.out.println("1. Agregar elemento ");
			System.out.println("2. Mostrar primer elemento "); 
			System.out.println("3. Eliminar elemento "); 
			System.out.println("4. Verificar si la cola está vacía"); 
			System.out.println("5. Salir del programa "); 
			System.out.println("6. Opción para guardar"); 
			System.out.println("------------------------------------"); 
			System.out.println("opción: "); 
			byte opcion = entrada.nextByte(); 
			
			switch(opcion) {
			case 1: System.out.println("Ingrese un nombre: ");
				String nombre = entrada.next(); 
				cola.offer(nombre); 
			break; 
			case 2:
				if(!cola.isEmpty()) {
				System.out.println("El primer elemento es: " + cola.peek());
				}else {
					System.out.println("La cola está vacía "); 
				}
			break; 
			case 3: System.out.println("Eliminando elemento..."); 
				cola.poll(); 
			break; 
			case 4:  
				if(cola.isEmpty()) {
					System.out.println("La cola está vacía. "); 
				}else {
					System.out.println("La contiene elementos. "); 
				}
			
			break; 
			case 5: System.out.println("Saliendo del programa..."); 
			trigger = true; 
			break; 
			default: System.out.println("Ingrese una opción dentro del menú"); 
			
			}
			
		}
		
		entrada.close();
	}

}
