package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables que representan los numeros que introducimos
		int num,num2;
		
		//pedimos que pobngamos un numero
		System.out.println("Introduzca el primer numero: ");
		
		//el valor de ese numero se guarda en la variable correspondiente
		num=sc.nextInt();
		
		//pedimos que introduzca otro
		System.out.println("Ahora introduce otro: ");
		
		//el valor del otro numero se guarda en la variable que le corresponde
		num2=sc.nextInt();
		
		//si uno de los numeros es mayor que el otro, se ordena de menor a mayor
		if (num<num2) {
			System.out.println(num+", "+num2);
		}
		else if(num>num2){
			System.out.println(num2+", "+num);
		}
		else {
			System.out.println("Son iguales");
		}
		
		
		//cierre de scanner
		sc.close();
	}

}
