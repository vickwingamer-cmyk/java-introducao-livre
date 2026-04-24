package Aula02.pratica;

import java.util.Scanner;

public class Maioridade {
	public static void main(String[]args) {
		//scanner digite
		Scanner sc = new Scanner(System.in);
		
		//exibir 
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		//se for 
		if (idade >=18) {
			System.out.println("Você é maior de idade");
			
		//se não for
		} else {
			System.out.print("Você é menor de idade");
	
		}
		
		sc.close();
		
	
	}

	

}
