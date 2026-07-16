import java.time.Year;
import java.util.Scanner;

public class SaudacaoEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idadeAproximada = Year.now().getValue() - anoNascimento;

        System.out.printf(
                "Olá, %s! Sua idade aproximada é %d anos.%n",
                nome,
                idadeAproximada
        );
    }
}

