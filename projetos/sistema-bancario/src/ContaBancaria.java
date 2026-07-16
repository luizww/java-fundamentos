public class ContaBancaria {
    private double saldo;
    private final double limiteChequeEspecial;
    private double taxaPendenteChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        if (depositoInicial < 0) {
            throw new IllegalArgumentException(
                    "O depósito inicial não pode ser negativo."
            );
        }

        saldo = depositoInicial;
        limiteChequeEspecial = depositoInicial <= 500
                ? 50
                : depositoInicial * 0.50;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getChequeEspecialDisponivel() {
        return Math.max(0, limiteChequeEspecial + Math.min(saldo, 0));
    }

    public double getSaldoDisponivel() {
        return saldo + limiteChequeEspecial;
    }

    public double getTaxaPendenteChequeEspecial() {
        return taxaPendenteChequeEspecial;
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo < 0;
    }

    public void depositar(double valor) {
        validarValorPositivo(valor);
        saldo += valor;

        if (saldo >= taxaPendenteChequeEspecial
                && taxaPendenteChequeEspecial > 0) {
            saldo -= taxaPendenteChequeEspecial;
            taxaPendenteChequeEspecial = 0;
        }
    }

    public boolean sacar(double valor) {
        return retirar(valor);
    }

    public boolean pagarBoleto(double valor) {
        return retirar(valor);
    }

    private boolean retirar(double valor) {
        validarValorPositivo(valor);

        if (valor > getSaldoDisponivel()) {
            return false;
        }

        double chequeUsadoAntes = Math.max(0, -saldo);
        saldo -= valor;
        double chequeUsadoDepois = Math.max(0, -saldo);

        double novoUsoCheque = chequeUsadoDepois - chequeUsadoAntes;
        if (novoUsoCheque > 0) {
            taxaPendenteChequeEspecial += novoUsoCheque * 0.20;
        }

        return true;
    }

    private void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo.");
        }
    }
}

