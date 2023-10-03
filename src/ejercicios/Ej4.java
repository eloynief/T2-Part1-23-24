package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num,num2;
		
		System.out.println("Introduzca el primer numero: ");
		
		num=sc.nextInt();
		
		System.out.println("Ahora introduce otro: ");
		
		num2=sc.nextInt();
		
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
