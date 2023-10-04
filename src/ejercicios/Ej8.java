package ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable que guarda el valor que representa la nota del alumno
		int num;
		
		//nos pide que introduzcamos el valor de la nota del alumno
		System.out.println("Introduzca la nota del alumno: ");
		
		//se introduce el valor que representa la nota
		num=sc.nextInt();
		
		//si el valor que representa la nota esta entre 0 y 4, imprime "INSUFICIENTE"
		if(num>=0&&num<5) {
			System.out.println("INSUFICIENTE");
		}
		//si el valor es 5, imprime "SUFICIENTE"
		else if(num==5) {
			System.out.println("SUFICIENTE");
		}
		//si es 6, imprime "BIEN" por pantalla
		else if(num==6) {
			System.out.println("BIEN");
		}
		//si el valor de la nota esta entre 7 y 8, imprime "NOTABLE"
		else if(num>=7&&num<=8) {
			System.out.println("NOTABLE");
		}
		//si el valor esta entre 9 y 10, imprime "SOBRESALIENTE" por pantalla
		else if(num>=9&&num<=10) {
			System.out.println("SOBRESALIENTE");
		}
		//si el valor esta fuera de estos valores, imprime que la nota no es valida
		else {
			System.out.println("Nota no valida");
		}
		
		//cierre de scanner
		sc.close();
	}

}
