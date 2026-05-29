package Aula07.pratica;

public class Cliente extends Pessoa{
	    int codigoCliente;
	    @Override
	    void saudacao() {
	        System.out.println("Olá cliente " + nome);
	    }

}
