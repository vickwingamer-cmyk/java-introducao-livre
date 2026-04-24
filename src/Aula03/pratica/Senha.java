package Aula03.pratica;
import java.util.Scanner;
public class Senha {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a sua senha: ");
		  int senha = sc.nextInt();
		  
		  while (senha!=1234) {
			  System.out.print("Senha incorreta, digite novamente!.");
			  senha = sc.nextInt();
			  
		  }
		  System.out.print("Login efetuado com sucesso!");
		
		
	}

}
