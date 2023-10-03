package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		
		//variabes que representan los numeros de la ecuacion quer vamos a hacer
		int a,b,c;
		
		//variables que representan los resultados que vamos a tener en la ecuacion
		double x1=0,x2=0;
		
		System.out.println("Introduzca los tres numeros de la ccuacion de 2o grado: ");
		
		a=sc.nextInt();
		
		b=sc.nextInt();
		
		c=sc.nextInt();
		
		//si sabemos que la raiz no es negativa
		if(Math.pow(b, 2)>=4*a*c) {
			//hacemos las ecuaciones
			x1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
	
			x2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
			
		}
		else {
			
		}
		
		//cierre de scanner
		sc.close();
	}

}
