import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura precisam ser maiores que zero.");
            return;
        }

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "abaixo do peso";
        } else if (imc < 25) {
            classificacao = "peso adequado";
        } else if (imc < 30) {
            classificacao = "sobrepeso";
        } else if (imc < 35) {
            classificacao = "obesidade grau I";
        } else if (imc < 40) {
            classificacao = "obesidade grau II";
        } else {
            classificacao = "obesidade grau III";
        }

        System.out.printf("IMC: %.2f — %s.%n", imc, classificacao);
    }
}

