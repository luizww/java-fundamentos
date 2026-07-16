public class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Márcio", 12);
        Pessoa pessoa2 = new Pessoa("Maria", 10);

        System.out.printf(
                "%s tem %d anos e %s tem %d anos.%n",
                pessoa1.getNome(),
                pessoa1.getIdade(),
                pessoa2.getNome(),
                pessoa2.getIdade()
        );
    }
}

