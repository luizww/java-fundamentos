import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado em cm: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.printf("Área do quadrado: %.2f cm²%n", area);
    }
}

