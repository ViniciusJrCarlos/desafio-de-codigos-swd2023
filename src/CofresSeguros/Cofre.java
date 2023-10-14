package CofresSeguros;

import java.util.Scanner;

abstract class Cofre   {
    protected String tipo;
    protected String metodoAbertura;

    //alterado nessa parte
    //protected int senha;
    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }



    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);

    }

    //Cofre cofre = new Cofre(tipo, metodoAbertura);




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

    //CofreDigital cofreDigital = new CofreDigital(senha);
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

   // CofreFisico cofreFisico = new CofreFisico(tipo, metodoAbertura);

}

class Desafio  {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        //super(tipo, metodoAbertura, senha);
        //int senha;
        //CofreDigital cofre = new CofreDigital(senha);
        //Cofre cofre = new Cofre(tipo, metodoAbertura, senha);
        //public abstract void CofreFisico();

        //public void CofreFisico();


        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {

            //imprimirInformacoes();
            //public abstact void CofreDigital();
            //System.out.println(tipoCofre);
            //System.out.println();
            //imprimirInformacoes();
            //void CofreDigital();
            // super();
           // super.imprimirInformacoes();
            System.out.println(tipoCofre);


        } else if (tipoCofre.equalsIgnoreCase("fisico")) {

            System.out.println(tipoCofre);
        } else {

            System.out.println(tipoCofre);

        }

    }

}
