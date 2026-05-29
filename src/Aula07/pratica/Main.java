package Aula07.pratica;
import java.util.ArrayList;
public class Main {
	
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		//INSTACIA CLASSE GERENTE 
		Gerente g1 = new Gerente();
		g1.nome = "Gabriel";
		g1.salario = 10000;
		
		//INSTACIA CLASSE DESENVOLVEDOR 
		
		Desenvolvedor d1 = new Desenvolvedor();
		d1.nome = "Bruno";
		d1.salario = 7000;
		
		
		// FUNCIONARIOS ADD
		funcionarios.add(g1);
        funcionarios.add(d1);
        
        
        //looping polimorfismo
        for (Funcionario f : funcionarios) {

            System.out.println("Funcionário: " + f.nome);
            System.out.println("Bônus: " + f.calcularBonus());
            System.out.println("----------------");
        }
    }
}