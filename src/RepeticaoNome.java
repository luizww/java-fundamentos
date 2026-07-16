import java.util.Scanner;

public class RepeticaoNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu nome ou 'sair': ");
            String nome = scanner.next();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("É um prazer conhecer você, " + nome + "!");
        }
    }
}

