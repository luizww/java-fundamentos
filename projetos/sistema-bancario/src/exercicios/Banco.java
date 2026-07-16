package exercicios;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var conta = new Conta_bancaria();

        while (true) {
            System.out.println("""
                    Bem-vindo ao banco! Selecione uma opção:
                    Digite [1] para consulta de saldo.
                    Digite [2] para consultar seu cheque especial.
                    Digite [3] para depositar dinheiro.
                    Digite [4] para sacar dinheiro.
                    Digite [5] para pagar um boleto.
                    Digite [6] para verificar se a conta está usando cheque especial.
                    Digite [7] para sair.
                    """);

            conta.setOpcao(scan.nextInt());

            if (conta.getOpcao() == 1) {
                System.out.println("Seu saldo é de " + conta.getSaldo());
            } else if (conta.getOpcao() == 2) {
                if (conta.isPrimeiroDeposito()) {
                    System.out.println(
                            "É preciso depositar saldo para liberar nosso cheque especial."
                    );
                } else {
                    System.out.println(
                            "Cheque especial disponível: " + conta.getChequeEspecial()
                    );
                }
            } else if (conta.getOpcao() == 3) {
                System.out.println("Digite o valor a ser depositado:");
                conta.depositar(scan.nextInt());
            } else if (conta.getOpcao() == 4) {
                System.out.println("Digite o valor a ser sacado:");
                conta.setSaldo(conta.getSaldo() - scan.nextInt());
            } else if (conta.getOpcao() == 5) {
                System.out.println("Digite o valor do boleto:");
                conta.setSaldo(conta.getSaldo() - scan.nextInt());
            } else if (conta.getOpcao() == 6) {
                if (conta.getChequeEspecial() >= 1) {
                    System.out.println("Essa conta tem um cheque especial ativo!");
                } else {
                    System.out.println("Essa conta não possui cheque especial em aberto!");
                }
            } else if (conta.getOpcao() == 7) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scan.close();
    }
}
