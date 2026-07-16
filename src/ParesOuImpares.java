import java.util.Scanner;

public class ParesOuImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fim = scanner.nextInt();
        System.out.print("[1] Ímpares ou [2] pares: ");
        int escolha = scanner.nextInt();

        if (fim < inicio || (escolha != 1 && escolha != 2)) {
            System.out.println("Intervalo ou opção inválida.");
            return;
        }

        for (int numero = inicio; numero <= fim; numero++) {
            boolean deveExibir = escolha == 1
                    ? numero % 2 != 0
                    : numero % 2 == 0;
            if (deveExibir) {
                System.out.println(numero);
            }
        }
    }
}

