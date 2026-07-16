import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero2 == 0) {
            System.out.println("Não é possível dividir por zero.");
            return;
        }

        System.out.printf("Resultado: %.2f%n", numero1 / numero2);
    }
}

