package UltimaTransacao;

import java.util.Scanner;

public class TransacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
        //String data, hora, descricao;
        //double valor;

        //String[] imprimir = partes[1].split(",");

        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);

        Transacao transacao = new Transacao(data, hora, descricao,  valor);
        transacao.imprimir();

        //Transacao transacao = new Transacao();
     //Transacao transacao = new Transacao(data, hora, descricao,  valor);
   //transacao.partes(data, hora, descricao, valor);

        //for(int i = 0; i < imprimir.length; i++){
           //String data, hora;
            //Transacao transacao = new Transacao();

          // imprimir();


       // }

    }

    //private static void imprimir() {
    //}

    // private static void imprimir(String[] partes) {
    //}
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;



    }

    /*
    public Transacao(){

        //super.imprimir(data,  hora, descricao, valor);

    }
*/
    public void imprimir() {

        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);

    }




}
