package aula01.exercicios;

public class CalculoMedia {
	public static void main(String[] args) {
		// valores
		double temperatura1 = 20.1;
		double temperatura2 = 13.5;
		double temperatura3 = 22.5;
		
		// calculo 
		double media = (temperatura1 + temperatura2 + temperatura3) / 3;
		
		// resultado
		System.out.println(" A media da temperatura foi de " + media);			
		
		//multiplicação
		
		double mediaDobro = media*2;
		System.out.println(" A média dobrada é: " + mediaDobro);
		
		//direto na saida 
		System.out.println("Outra forma de mostrar a média: " +(media*2));
		
		
				
	}

}

