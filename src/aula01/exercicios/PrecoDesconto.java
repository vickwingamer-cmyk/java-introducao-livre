package aula01.exercicios;

public class PrecoDesconto {
	public static void main(String[] args) {
		// valor dos produtos 
		double valorOriginal = 150;
		double percentualDesconto = 15;
		
		// calculando
		double valorDesconto = (valorOriginal * percentualDesconto) / 100;
		 
		// valor final
		double valorFinal = (valorOriginal - valorDesconto);
		
		//exibição
		System.out.println(" preço do produto: R$" + valorOriginal);
		System.out.println("percentual de desconto:" + percentualDesconto);
		System.out.println(" valor do desconto: R$" + valorDesconto);
		System.out.println(" Valor com desconto: R$" + valorFinal);	
	}

}
