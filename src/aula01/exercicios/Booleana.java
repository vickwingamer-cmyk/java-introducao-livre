package aula01.exercicios;

public class Booleana {
public static void main(String[] args) {
		
		// Dados
		int idade = 18;
		boolean temTitulo = true;
		
		
		//Regras ser maior 
		boolean podeVotar = (idade>= 18) && (temTitulo == true);
		
		//exibição
		System.out.println("Pode votar?" + podeVotar);

		
	}

}