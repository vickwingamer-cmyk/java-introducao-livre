package Aula07.pratica;

public class Desenvolvedor extends Funcionario {

    @Override
    double calcularBonus() {
        return salario * 0.15;
    }
}
