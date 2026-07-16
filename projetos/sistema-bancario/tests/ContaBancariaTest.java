public class ContaBancariaTest {
    public static void main(String[] args) {
        deveDefinirLimiteDeCinquentaReais();
        deveDefinirLimiteDeCinquentaPorCento();
        deveCobrarTaxaSobreUsoDoCheque();
        deveRecusarSaqueAcimaDoDisponivel();
        System.out.println("Todos os testes passaram.");
    }

    private static void deveDefinirLimiteDeCinquentaReais() {
        ContaBancaria conta = new ContaBancaria(400);
        assert conta.getLimiteChequeEspecial() == 50;
    }

    private static void deveDefinirLimiteDeCinquentaPorCento() {
        ContaBancaria conta = new ContaBancaria(600);
        assert conta.getLimiteChequeEspecial() == 300;
    }

    private static void deveCobrarTaxaSobreUsoDoCheque() {
        ContaBancaria conta = new ContaBancaria(400);

        assert conta.sacar(430);
        assert conta.getSaldo() == -30;
        assert conta.getTaxaPendenteChequeEspecial() == 6;

        conta.depositar(40);
        assert conta.getSaldo() == 4;
        assert conta.getTaxaPendenteChequeEspecial() == 0;
    }

    private static void deveRecusarSaqueAcimaDoDisponivel() {
        ContaBancaria conta = new ContaBancaria(100);
        assert !conta.sacar(151);
        assert conta.getSaldo() == 100;
    }
}

