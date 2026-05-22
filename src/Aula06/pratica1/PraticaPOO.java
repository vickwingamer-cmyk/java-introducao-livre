package Aula06.pratica1;

public class PraticaPOO {

 
    // CLASSE ALUNO (MOLDE)
 
    static class Aluno {

        // atributos (características do aluno)
        String nome;
        int idade;

        // método para exibir informações do aluno
        void apresentar() {
            System.out.println("Olá, meu nome é " + nome);
        }
    }

    // CLASSE CONTA (MOLDE)

    static class Conta {

        // atributos da conta
        String titular;
        private float saldo; 

      
        void setSaldo(float saldo) {
            if (saldo > 0) { 
                this.saldo = saldo;
            }
        }

        //consultar saldo 
        float getSaldo() {
            return saldo;
        }

        // depositar dinheiro na conta
        void depositar(float valor) {
            this.saldo += valor;
        }
    }

  
    public static void main(String[] args) {

        //  objeto aluno 1
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Vick";
        aluno1.idade = 24;

        //  objeto aluno 2
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 54;

   
        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);


        aluno1.apresentar();
        aluno2.apresentar();

        //  objeto conta
        Conta conta = new Conta();

        //  saldo inicial
        conta.setSaldo(100);

        // depositando valor na conta
        conta.depositar(50);

        // exibindo saldo final
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}