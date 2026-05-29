package Aula07.pratica;
import java.util.ArrayList;
public class Main {
	
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		//INSTACIA CLASSE GERENTE 
		//Gerente g1 = new Gerente();
		 //g1.nome = "Gabriel";
		//g1.salario = 10000;
		
		//INSTACIA CLASSE DESENVOLVEDOR 
		
		//Desenvolvedor d1 = new Desenvolvedor();
		//d1.nome = "Bruno";
		//d1.salario = 7000;
		
		
		// FUNCIONARIOS ADD
		//funcionarios.add(g1);
        //funcionarios.add(d1);
        
        funcionarios.add(new Gerente("Antonio", 4000.00));
		funcionarios.add(new Desenvolvedor("Severino", 12000.00));
		funcionarios.add(new Funcionario("Cleide", 6000.00));
		
        //looping 
        for (Funcionario f : funcionarios) {

            System.out.println(f.getNome());
			System.out.println("Salario total: " + f.salario());
            System.out.println("Bônus: " + f.calcularBonus());
			System.out.println("f.getSalario());
            System.out.println("----------------");
        }
    }

