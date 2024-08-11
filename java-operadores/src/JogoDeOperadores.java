import java.util.Scanner;


public class JogoDeOperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Operadores!");
        System.out.println("Identifique a categoria do operador apresentado.");
        System.out.println("As categorias são: Atribuição, Aritmético, Unário, Ternário, Relacional");
        System.out.println("Digite sua resposta sem usar acentos e pressione Enter.\n");

        String[] operadores = {"+", "-", "*", "/", "=", "==", "++", "--", "?", ">", "<"};
        String[] categoriasCorretas = {
            "Aritmetico", "Aritmetico", "Aritmetico", "Aritmetico", 
            "Atribuicao", "Relacional", "Unario", "Unario", 
            "Ternario", "Relacional", "Relacional"
        };

        int pontuacao = 0;

        for (int i = 0; i < operadores.length; i++) {
            System.out.print("Operador: " + operadores[i] + "\nCategoria: ");
            String respostaUsuario = scanner.nextLine().trim();

            // Linha de impressão para verificar a entrada capturada
            System.out.println("Entrada capturada: " + respostaUsuario);

            // Verifique se a resposta é correta usando operador ternário
            boolean isCorrect = respostaUsuario.equalsIgnoreCase(categoriasCorretas[i]);
            System.out.println(isCorrect ? "Correto!\n" : "Errado. A categoria correta é: " + categoriasCorretas[i] + "\n");

            // Incrementa pontuação se correto
            if (isCorrect) {
                pontuacao++;
            }
        }

        System.out.println("Sua pontuação final é: " + pontuacao + " de " + operadores.length);

        scanner.close();
    }

}
