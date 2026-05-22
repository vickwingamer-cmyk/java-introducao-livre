package Atividades;

public class Principal {
	 public static void main(String[] args) {
// instancia Classe Pessoa
		 System.out.println("Utilizando a classe pessoa");
	        Pessoa p1 = new Pessoa(); // primeiro objeto
	        p1.nome = "Davi";
	        p1.idade = 16;
	        
	        Pessoa p2 = new Pessoa(); // Segundo objeto
	        p2.nome = "Rebeca";
	        p2.idade = 13;

	        System.out.println("Nome: " + p1.nome);
	        System.out.println("Idade: " + p1.idade);

	        System.out.println("---------------------------");

	        System.out.println("Nome: " + p2.nome);
	        System.out.println("Idade: " + p2.idade);
	        
	        //INSTANCIA CLASSE CARRO
	        
	        System.out.println("---------------------------");
	        System.out.println("Utilizando a classe Carro");
	        Carro meuCarro = new Carro();
			 meuCarro.marca = "Honda";
			 meuCarro.modelo = "Civic g10";
			 meuCarro.ano = 2021;
			 
			 System.out.println("Marca: "+ meuCarro.marca);
			 System.out.println("Modelo: "+ meuCarro.modelo);
			 System.out.println("Ano: "+ meuCarro.ano);
			 System.out.println("---------------------------");
			 
		     //INSTANCIA CLASSE CLASSE
			 System.out.println("Utilizando a classe Cachorro");
			        Cachorro meuCachorro = new Cachorro();

			        meuCachorro.nome = "Jully";
			        meuCachorro.raca = "Poodle";

			        meuCachorro.latir();
			        meuCachorro.comer();
			        System.out.println("---------------------------");
			        
			      //INSTANCIA CLASSE CACHORRO
			        System.out.println("Utilizando a classe Semaforo");
			        Semaforo semaforo = new Semaforo();
			        semaforo.mudarParaVerde();
			        semaforo.mudarParaAmarelo();
			        semaforo.mudarParaVermelho();
			        	        	
			        }
	    }


