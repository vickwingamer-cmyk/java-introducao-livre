package Aula07.pratica;

	public class Gerente extends Funcionario {
		public Gerente (String nome, double salario) {
			super(nome, salario);
	@Override
	double calcularBonus() {
		return salario * 0.20;
		
		
	}

}
