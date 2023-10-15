package Cofre;

import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }

    protected void exibirInformacoes() {

        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }

    //protected void exibirInformacoes() {
    //}
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }

    //super.CofreDigital.imprimirInformacoes();
    //CofreDigital cofreDigital = new CofreDigital(senha);

    //cofreDigital

}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

class Desafio extends Cofre{
    public Desafio(String tipo, String metodoAbertura) {
        super(tipo, metodoAbertura);
    }


    //public Desafio (String tipo, String metodoAbertura) {
        //super(tipo, metodoAbertura);
   // }

    //public void CofreFisico(String tipo, String metodoAbertura) {

        //super(tipo, metodoAbertura);
   // }
    //Desafio desafio = new Desafio(tipo, metodoAbertura);
    //private int senha;
    //desafio.imprimirInformacoes();
     //CofreDigital cofreDigital = new CofreDigital(senha);
     //CofreFisico cofreFisico = new CofreFisico();

     //Cofre cofre = new Cofre();
    //desafio.Cofre(tipo, metod);


    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)




        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();




        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {


            ///@Contract
           // super("Cofre Digital", "Senha",senha, confirmacaoSenha);
            int senha = scanner.nextInt();
            int confirmacaoSenha = scanner.nextInt();

            if (senha != confirmacaoSenha) {
                //imprimirInformacoes(); falta nesse ponto trazer algo que faca apresentar a msg Tipo: Cofre digital ou fisico
                //
                  //exibirInformacoes();
                    //System.out.println("Tipo: " + this.tipo);
                    //System.out.println("Metodo de abertura: " + this.metodoAbertura);


                System.out.println("Senha Incorreta!");
            } else {

              // public void imprimirInformacoes
                System.out.println("Cofre Aberto!");
            }

        } else  {

            //super.exibirInformacoes();
        }
    }
}