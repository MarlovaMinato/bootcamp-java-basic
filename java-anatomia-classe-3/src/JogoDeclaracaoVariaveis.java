import java.util.Scanner;

public class JogoDeclaracaoVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarações de variáveis para o jogo
        String[] declaracoes = {
            "int idade = 23;",
            "double altura = 1.62;",
            "Dog spike;",
            "23 int idade = ;",
            "Dog = spike;"
        };

        // Respostas corretas
        char[] respostasCorretas = {'V', 'V', 'V', 'F', 'F'};

        // Instruções para o usuário
        System.out.println("Bem-vindo ao jogo de declaração de variáveis em Java!");
        System.out.println("A estrutura correta para declarar uma variável é:");
        System.out.println("Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)");
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
