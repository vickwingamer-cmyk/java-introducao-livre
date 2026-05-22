package Atividades;

public class Produto {
	String nome;
	double preco;
	int estoque;
	
	public static void main(String[]args) {
		Produto item = new Produto();
		item.nome= "PS5";
		item.preco=5000;
		item.estoque= 5;
		
		System.out.println("Nome: " + item.nome);
		System.out.println("Preço: " + item.preco);
		System.out.println("Estoque: " + item.estoque);
		
		
		
	}


}
