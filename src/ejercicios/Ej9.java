package ejercicios;

import java.util.Scanner;

public class Ej9 {
	
	
	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable que representa la opcion quer vas a elegir
		String opcion1,opcion2;
		
		
		//
		System.out.println("Elige una opcion: PIEDRA, PAPEL, TIJERA");
		
		//se le introduce le valor a la variable
		opcion1=sc.nextLine();
		
		//se le introduce le valor a la variable
		opcion2=sc.nextLine();
		
		//
		if(opcion1.equals(opcion2)) {
			System.out.println("empate");
		}
		else if(opcion1.equals("PIEDRA")&&opcion2.equals("PAPEL")) {
			System.out.println("J2 GANA");
		}
		else if(opcion1.equals("PAPEL")&&opcion2.equals("TIJERA")) {
			System.out.println("J2 GANA");
		}
		else if(opcion1.equals("TIJERA")&&opcion2.equals("PIEDRA")) {
			System.out.println("J2 GANA");
		}
		else if(opcion2.equals("PIEDRA")&&opcion1.equals("PAPEL")) {
			System.out.println("J1 GANA");
		}
		else if(opcion2.equals("PAPEL")&&opcion1.equals("TIJERA")) {
			System.out.println("J1 GANA");
		}
		else if(opcion2.equals("TIJERA")&&opcion1.equals("PIEDRA")) {
			System.out.println("J1 GANA");
		}
		else {
			System.err.println("VALOR NO VALIDO INTRODUCIDO");
		}
		
		//cierre de scanner
		sc.close();
	}

}
