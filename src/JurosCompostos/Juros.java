package JurosCompostos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Juros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;


        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        //public void jurosCompostos(double valorInicial, double taxaJuros, int periodo) {


        //}
        //taxaJuros = taxaJuros / 100;
        //valorFinal = valorInicial * (1 - (taxaJuros / 100))  periodo;

        valorFinal =  valorInicial * Math.pow((1 + taxaJuros), periodo);


        //System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        System.out.printf("Valor final do investimento: R$ %.2f%n",(valorFinal));
        scanner.close();
   }
}
