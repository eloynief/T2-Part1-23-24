package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable donde guardamos el numero que introducimos
		double num;
		
		//pedimos en pantalla que introduzcamos un numero
		System.out.println("Introduce el numero: ");
		
		//introducimos el numero
		num=sc.nextDouble();
		
		
		if (num>0&&num<1||num<0&&num>-1) {
			//si el numero cumple con lo dicho en el if, se ejecuta esto
			System.out.println("Es casi 0");
		}
		else {
			//si no lo hace, se ejecuta lo del else
			System.out.println("No es casi 0");
		}
		
		
		
		//cierre de scanner
		sc.close();
	}

}
