package Aula07.pratica;

public class Funcionario {
	protected String nome;
	protected double salario;

	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;

	}
	
	double calcularBonus() {
		return salario * 0.10;
	}
	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

}
