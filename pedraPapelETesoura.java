import java.util.Random;
import java.util.Scanner;

public class pedraPapelETesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        while (true) {
            System.out.println("\nEscolha sua jogada: ");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Sair");

            int jogador = scanner.nextInt();
            if (jogador == 4) {
                System.out.println("Saindo...");
                break;
            }

            if (jogador < 1 || jogador > 3) {
                System.out.println("Opção inválida!");
                continue;
            }

            int computador = random.nextInt(3) + 1;

            System.out.println("Você escolheu: " + opcoes[jogador - 1]);
            System.out.println("Computador escolheu: " + opcoes[computador - 1]);

            if (jogador == computador) {
                System.out.println("Empate!");
            } else if ((jogador == 1 && computador == 3) ||
                    (jogador == 2 && computador == 1) ||
                    (jogador == 3 && computador == 2)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
        }
    }
}
