package Aula03.pratica;

public class SomaTotal {
	public static void main(String[] args) {
		int contador = 1;
		int contador2 = 1;
		int soma =0;
		int soma2 = 0;
		
		while(contador<=5) {
			System.out.print(contador+"...");
			soma = soma+contador;		
			contador++;

			
		}
		System.out.print("A Soma de todos os valores é:" + soma);		
	

		
	}
	

}