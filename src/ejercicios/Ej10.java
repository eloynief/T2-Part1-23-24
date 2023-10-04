package ejercicios;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);

		//variables para guardar los numeros que introducimos
		int num1,num2,num3;
		
		//le pedimos 3 numeros al usuario
		System.out.println("Introduzca 3 números: ");
		
		
		//introduccion del valor a las variables que representan los numeros
		num1=sc.nextInt();
		
		num2=sc.nextInt();

		num3=sc.nextInt();
		
		//si el valor de dos de los numeros es igual al otro, se hacen las operaciones de if y del else if
		if(num1+num2==num3) {
			System.out.println("la suma de"+num1+""+num2+"="+num3);
		}
		else if(num1+num3==num2) {
			System.out.println("la suma de"+num1+""+num3+"="+num2);
		}
		else if(num2+num3==num1) {
			System.out.println("la suma de"+num2+""+num3+"="+num1);
		}
		//si esto no ocurre en ningún caso, muestra en pantalla que la suma de los dos numeros no es igual al otro
		else {
			System.out.println("la suma de dos numeros no es igual al otro");
		}
		
		//cierre de scanner
		sc.close();
	}

}
