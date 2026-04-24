package Aula02.pratica;
import java.util.Scanner; 
public class ImparPar {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite um número: " );
			int numero = sc.nextInt();
			
			if(numero % 2==0) {
				System.out.print("O número é par");
				
			} else {
				System.out.print("O numero é ímpar: ");
				
			}
			sc.close();
		
		}
		

	}
