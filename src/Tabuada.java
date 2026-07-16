import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.printf(
                    "%d x %d = %d%n",
                    numero,
                    multiplicador,
                    numero * multiplicador
            );
        }
    }
}

