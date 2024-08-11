import java.util.Scanner;

public class JogoDeOperacoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplos de código e resultados esperados
        String[] exemplos = {
            "int x = 5;\nx++; // O que x imprime após essa operação?",
            "int y = 10;\ny = y + 2; // O que y imprime após essa operação?",
            "int a = 7;\na--; // O que a imprime após essa operação?",
            "int b = 3;\nb *= 2; // O que b imprime após essa operação?",
            "int c = 4;\nc = c / 2; // O que c imprime após essa operação?",
            "int d = 9;\nd += 3; // O que d imprime após essa operação?",
            "int e = 15;\ne -= 5; // O que e imprime após essa operação?"
        };

        // Resultados esperados
        int[] resultados = {6, 12, 6, 6, 2, 12, 10};

        int pontuacao = 0;

        System.out.println("Bem-vindo ao Jogo de Operações!");
        System.out.println("Para cada exemplo de código, digite o resultado esperado e pressione Enter.\n");

        for (int i = 0; i < exemplos.length; i++) {
            System.out.println("Exemplo de Código:\n" + exemplos[i]);
            System.out.print("Resultado esperado: ");
            int respostaUsuario = scanner.nextInt();

            if (respostaUsuario == resultados[i]) {
                System.out.println("Correto!\n");
                pontuacao++;
            } else {
                System.out.println("Errado. O resultado correto é: " + resultados[i] + "\n");
            }
        }

        System.out.println("Jogo concluído! Sua pontuação final é: " + pontuacao + " de " + exemplos.length);
        scanner.close();
    }
}
