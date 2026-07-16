import java.util.Scanner;

public class DiferencaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da primeira pessoa: ");
        String nome1 = scanner.next();
        System.out.print("Idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Nome da segunda pessoa: ");
        String nome2 = scanner.next();
        System.out.print("Idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.printf(
                "A diferença de idade entre %s e %s é de %d ano(s).%n",
                nome1,
                nome2,
                diferenca
        );
    }
}

