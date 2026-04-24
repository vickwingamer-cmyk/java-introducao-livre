package Aula02.pratica;
import java.util.Scanner;

public class SimulacaoCaixa {
		public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite sua conta: ");
		        String conta = sc.nextLine();

		        System.out.print("Digite a senha: ");
		        String senha = sc.nextLine();

		        double saldo = 500.00;

		        if (conta.equals("203919") && senha.equals("123456")) {

		            System.out.println("//__Acesso liberado__//");
		            System.out.println("Saldo atual: " + saldo);
		            
		     
				  		
		            System.out.println("\n__CAIXA ELETRONICO__");
		            System.out.print("Digite o valor do saque: ");
		            double valorSaque = sc.nextDouble();

		            if (valorSaque % 10 != 0) {
		                System.out.println("Erro: o valor deve ser múltiplo de 10.");
		            } 
		            else if (valorSaque > saldo) {
		                System.out.println("Erro: saldo insuficiente.");
		            } 
		            else {
		                saldo = saldo - valorSaque;
		                System.out.println("Saque realizado com sucesso!");
		                System.out.println("Novo saldo: R$ " + saldo);
		            }

		        } else {
		            System.out.println("Acesso negado");
		        }

		        sc.close();
		    }
		}

