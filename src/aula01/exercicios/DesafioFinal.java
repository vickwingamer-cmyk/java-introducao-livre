package aula01.exercicios;

public class DesafioFinal {
	public static void main(String[] args) {
		// dados funcionario
		String nome = "Victória";
		double salarioFixo = 2500.59;
		
		// percentual de bônus
		double bonus = 300.50;
		
		// Imposto
		double percentualImposto = 45.2;
		
		double salarioComBonus = salarioFixo + bonus;
		
		// calculando 
		double valordesconto = ( salarioFixo * percentualImposto) / 100;
		
		//valor final imposto 
		double valorFinal = ( salarioFixo - percentualImposto);
		
		//exibição 
		System.out.println("__ Perfil Financeiro__");
		System.out.println("Nome: " + nome);
		System.out.println("Salário Fixo: R$: " + salarioFixo);
		System.out.println("Bônus: R$ " + bonus);
		System.out.println("Salario com Bônus: R$ " + salarioComBonus);
		System.out.println("Percentual desconto imposto: R$ " + percentualImposto);
		System.out.println("Valor final: " + valorFinal);
		
		
		
	}

}
