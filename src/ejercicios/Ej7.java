package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca el numero: ");
		
		num=sc.nextInt();
		
		if(num>=0&&num<10) {
			System.out.println("El numero tiene 1 cifra");
		}
		else if(num>=10&&num<100) {
			System.out.println("El numero tiene 2 cifras");
		}
		else if(num>=100&&num<1000) {
			System.out.println("El numero tiene 3 cifras");
		}
		else if(num>=1000&&num<10000) {
			System.out.println("El numero tiene 4 cifras");
		}
		else if(num>=1000&&num<10000) {
			System.out.println("El numero tiene 5 cifras");
		}
		else {
			System.out.println("El numero tiene más de 5 cifras");
		}
		//cierre de scanner
		sc.close();
	}

}
