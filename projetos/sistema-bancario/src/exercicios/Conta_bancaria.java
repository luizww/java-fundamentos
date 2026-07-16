package exercicios;

public class Conta_bancaria {
    private int opcao;
    private int saldo;
    private int cheque_especial;
    private boolean primeiroDeposito = true;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getChequeEspecial() {
        return cheque_especial;
    }

    public boolean isPrimeiroDeposito() {
        return primeiroDeposito;
    }

    public void depositar(int valor) {
        saldo += valor;

        if (primeiroDeposito) {
            cheque_especial = valor;
            primeiroDeposito = false;
        }
    }
}
