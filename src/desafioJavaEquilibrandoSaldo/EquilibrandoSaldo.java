package desafioJavaEquilibrandoSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        saldoAtual = saldoAtual + valorDeposito - valorRetirada;

        System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);

        // Fechar o scanner
        scanner.close();



    }

}