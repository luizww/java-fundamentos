import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta;
        try {
            conta = new ContaBancaria(depositoInicial);
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
            return;
        }

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            try {
                executarOpcao(opcao, conta, scanner);
            } catch (IllegalArgumentException erro) {
                System.out.println("Operação não realizada: " + erro.getMessage());
            }
        } while (opcao != 7);
    }

    private static void exibirMenu() {
        System.out.println(
                """

                === SISTEMA BANCÁRIO ===
                [1] Consultar saldo
                [2] Consultar cheque especial
                [3] Depositar dinheiro
                [4] Sacar dinheiro
                [5] Pagar boleto
                [6] Verificar uso do cheque especial
                [7] Sair
                """
        );
        System.out.print("Escolha: ");
    }

    private static void executarOpcao(
            int opcao,
            ContaBancaria conta,
            Scanner scanner
    ) {
        switch (opcao) {
            case 1 -> mostrarSaldo(conta);
            case 2 -> mostrarChequeEspecial(conta);
            case 3 -> depositar(conta, scanner);
            case 4 -> sacar(conta, scanner);
            case 5 -> pagarBoleto(conta, scanner);
            case 6 -> verificarUsoCheque(conta);
            case 7 -> System.out.println("Sessão encerrada.");
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void mostrarSaldo(ContaBancaria conta) {
        System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
        System.out.printf(
                "Saldo total disponível: R$ %.2f%n",
                conta.getSaldoDisponivel()
        );
    }

    private static void mostrarChequeEspecial(ContaBancaria conta) {
        System.out.printf(
                "Limite total: R$ %.2f%n",
                conta.getLimiteChequeEspecial()
        );
        System.out.printf(
                "Limite disponível: R$ %.2f%n",
                conta.getChequeEspecialDisponivel()
        );
    }

    private static void depositar(
            ContaBancaria conta,
            Scanner scanner
    ) {
        System.out.print("Valor do depósito: R$ ");
        conta.depositar(scanner.nextDouble());
        System.out.printf("Novo saldo: R$ %.2f%n", conta.getSaldo());
    }

    private static void sacar(
            ContaBancaria conta,
            Scanner scanner
    ) {
        System.out.print("Valor do saque: R$ ");
        boolean realizado = conta.sacar(scanner.nextDouble());
        mostrarResultadoRetirada(realizado, conta);
    }

    private static void pagarBoleto(
            ContaBancaria conta,
            Scanner scanner
    ) {
        System.out.print("Valor do boleto: R$ ");
        boolean realizado = conta.pagarBoleto(scanner.nextDouble());
        mostrarResultadoRetirada(realizado, conta);
    }

    private static void mostrarResultadoRetirada(
            boolean realizado,
            ContaBancaria conta
    ) {
        if (realizado) {
            System.out.printf("Operação realizada. Saldo: R$ %.2f%n", conta.getSaldo());
        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }

    private static void verificarUsoCheque(ContaBancaria conta) {
        if (conta.estaUsandoChequeEspecial()) {
            System.out.println("A conta está usando o cheque especial.");
            System.out.printf(
                    "Taxa pendente: R$ %.2f%n",
                    conta.getTaxaPendenteChequeEspecial()
            );
        } else {
            System.out.println("A conta não está usando o cheque especial.");
        }
    }
}

