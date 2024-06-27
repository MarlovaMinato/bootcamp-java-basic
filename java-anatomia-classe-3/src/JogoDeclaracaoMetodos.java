import java.util.Scanner;

public class JogoDeclaracaoMetodos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarações de métodos para o jogo
        String[] declaracoes = {
            "int somar(int numeroUm, int numero2)",
            "String formatarCep(long cep)",
            "void iniciar()",
            "cep formatar String (long)",
            "iniciar void()"
        };

        // Respostas corretas
        char[] respostasCorretas = {'V', 'V', 'V', 'F', 'F'};

        // Instruções para o usuário
        System.out.println("Bem-vindo ao jogo de declaração de métodos em Java!");
        System.out.println("A estrutura correta para declarar um método é:");
        System.out.println("TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)");
        System.out.println("Responda com 'V' para verdadeiro e 'F' para falso.\n");

        // Variável para armazenar o número de respostas corretas
        int pontuacao = 0;

        // Iterar sobre as declarações
        for (int i = 0; i < declaracoes.length; i++) {
            System.out.println("Declaração: " + declaracoes[i]);
            System.out.print("Essa declaração está correta? (V/F): ");
            char respostaUsuario = scanner.next().charAt(0);

            // Verificar a resposta do usuário
            if (respostaUsuario == respostasCorretas[i]) {
                System.out.println("Correto!\n");
                pontuacao++;
            } else {
                System.out.println("Errado.\n");
            }
        }

        // Exibir pontuação final
        System.out.println("Jogo finalizado! Você acertou " + pontuacao + " de " + declaracoes.length + " declarações.");

        scanner.close();
    }
}
