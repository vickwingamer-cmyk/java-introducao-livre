package Aula07.pratica;

public class Funcionario2 extends Pessoa {
	
	    String matricula;
	    String departamento;

	    @Override
	    void saudacao() {
	        System.out.println("Olá funcionário " + nome);
	    }

}
