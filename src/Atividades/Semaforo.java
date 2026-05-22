package Atividades;

public class Semaforo {
	String corAtual;
	
	void mudarParaVermelho() {
		corAtual = "vermelho";
		System.out.println("O semaforo ficará vermelho");
	}
	
	void mudarParaAmarelo() {
		corAtual = "Amarelo";
		System.out.println("O semaforo ficará Amarelo");
	}
	void mudarParaVerde() {
		corAtual = "Verde";
		System.out.println("O semaforo ficará Verde");
	}

}
