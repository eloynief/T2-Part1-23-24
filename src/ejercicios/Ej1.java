package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un numero: ");
		
		num=sc.nextInt();
		
		if (num%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
		
		//cierre de scanner
		sc.close();
	}

}
