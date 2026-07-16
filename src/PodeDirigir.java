import java.util.Scanner;

public class PodeDirigir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Você é emancipado? (s/n): ");
        boolean emancipado = scanner.next().equalsIgnoreCase("s");

        boolean podeDirigir = idade >= 18 || (idade >= 16 && emancipado);
        System.out.println(
                podeDirigir
                        ? "Você atende ao requisito de idade do exercício."
                        : "Você ainda não atende ao requisito de idade."
        );
    }
}

