package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables para guardar el valor de los numeros que queremos introducir
		int num1,num2,num3;
		
		//le pedimos 3 numeros al usuario
		System.out.println("Introduzca 3 números: ");
		
		num1=sc.nextInt();
		
		num2=sc.nextInt();

		num3=sc.nextInt();
		
		//
		if(num1<=num2&&num2<=num3) { //si num3>num2>num
			System.out.println(num3+", "+num2+", "+num1);
		}
		else if(num2<=num1&&num1<=num3) {//si num3>num>num2
			System.out.println(num3+", "+num1+", "+num2);
		}
		else if(num1<=num2&&num3<=num2) { //si num2>num3>num
			System.out.println(num2+", "+num3+", "+num1);
		}
		else if(num3<=num1&&num1<=num2) {//si num2>num>num3
			System.out.println(num2+", "+num1+", "+num3);
		}
		else if(num3<=num2&&num2<=num1) {//si num>num2>num3
			System.out.println(num1+", "+num2+", "+num3);
		}
		else if(num2<=num3&&num3<=num1) {//si num>num3>num2
			System.out.println(num1+", "+num3+", "+num2);
		}
		else {
			System.out.println("ERROR CASO");
		}
		
		
		//cierre de scanner
		sc.close();
	}

}
