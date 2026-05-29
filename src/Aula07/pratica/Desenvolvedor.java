package Aula07.pratica;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);

    @Override
    double calcularBonus() {
        return salario * 0.15;
    }
}
