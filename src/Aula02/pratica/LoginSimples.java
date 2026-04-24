package Aula02.pratica;
import java.util.Scanner;

public class LoginSimples {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite seu usuario: ");
			String usuario = sc.nextLine();
			
			System.out.print("Digite a senha: ");
			String senha = sc.nextLine();
			
			if (usuario.equals("Admin") && senha.equals("123")) {
			System.out.print("Acesso liberado:");
			
		}  else {
			System.out.print(" Acesso negado");
			
			
	    }
	}
			
}

