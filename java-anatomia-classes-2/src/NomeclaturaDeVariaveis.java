import java.util.Scanner;

public class NomeclaturaDeVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome de uma classe
        System.out.println("Digite o nome de uma classe (use PascalCase):");
        String nomeClasse = scanner.nextLine();
        nomeClasse = corrigirPascalCase(nomeClasse);
        System.out.println("Você nomeou a classe como: " + nomeClasse);

        // Solicitar o nome de uma variável de instância
        System.out.println("Digite o nome de uma variável de instância (use camelCase):");
        String nomeVariavelInstancia = scanner.nextLine();
        nomeVariavelInstancia = corrigirCamelCase(nomeVariavelInstancia);
        System.out.println("Você nomeou a variável de instância como: " + nomeVariavelInstancia);

        // Solicitar o nome de um método
        System.out.println("Digite o nome de um método (use camelCase):");
        String nomeMetodo = scanner.nextLine();
        nomeMetodo = corrigirCamelCase(nomeMetodo);
        System.out.println("Você nomeou o método como: " + nomeMetodo);

        // Solicitar o nome de um parâmetro
        System.out.println("Digite o nome de um parâmetro (use camelCase):");
        String nomeParametro = scanner.nextLine();
        nomeParametro = corrigirCamelCase(nomeParametro);
        System.out.println("Você nomeou o parâmetro como: " + nomeParametro);


        // Solicitar o nome de uma constante
        System.out.println("Digite o nome de uma constante (use UPPER_SNAKE_CASE):");
        String nomeConstante = scanner.nextLine();
        nomeConstante = corrigirUpperSnakeCase(nomeConstante);
        System.out.println("Você nomeou a constante como: " + nomeConstante);

    

        // Exemplo de uso dos nomes fornecidos
        System.out.println("\nAqui está um exemplo de código usando seus nomes:");

        System.out.println("public class " + nomeClasse + " {");
        System.out.println("    private String " + nomeVariavelInstancia + ";");
        System.out.println("    public static final String " + nomeConstante + " = \"CONSTANTE\";");
        System.out.println("");
        System.out.println("    public void " + nomeMetodo + "(String " + nomeParametro + ") {");
        System.out.println("        this." + nomeVariavelInstancia + " = " + nomeParametro + ";");
        System.out.println("        System.out.println(\"Valor de " + nomeVariavelInstancia + ": \" + " + nomeParametro + ");");
        System.out.println("    }");
        System.out.println("}");

        scanner.close();
    }

    // Método para corrigir o nome PascalCase
    private static String corrigirPascalCase(String nome) {
        String[] partes = nome.split(" ");
        StringBuilder nomeCorrigido = new StringBuilder();

        
        for (String parte : partes) {
            if (!parte.isEmpty()) { // Verifica se a parte não está vazia
                if (Character.isUpperCase(parte.charAt(0))) {
                    // Se a primeira letra já é maiúscula, mantém como está
                    nomeCorrigido.append(parte);
                    } else {
                        // Corrige para PascalCase
                        nomeCorrigido.append(Character.toUpperCase(parte.charAt(0)));
                        if (parte.length() > 1) {
                            nomeCorrigido.append(parte.substring(1).toLowerCase()); 
                        }                  
                }
        
            }
        }
    
        return nomeCorrigido.toString(); //.trim(); // Remove o espaço extra no final
    }



    // Método para corrigir o nome em camelCase
    private static String corrigirCamelCase(String nome) {
        String[] partes = nome.split(" ");
        StringBuilder nomeCorrigido = new StringBuilder();

        if (partes.length > 0) {
            nomeCorrigido.append(partes[0].toLowerCase());
        }

        for (int i = 1; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                nomeCorrigido.append(Character.toUpperCase(partes[i].charAt(0)));
                if (partes[i].length() > 1) {
                    nomeCorrigido.append(partes[i].substring(1).toLowerCase());
                }
            }
        }
        return nomeCorrigido.toString();
    }

    // Método para corrigir o nome em UPPER_SNAKE_CASE
    private static String corrigirUpperSnakeCase(String nome) {
        String[] partes = nome.split(" ");
        StringBuilder nomeCorrigido = new StringBuilder();

        for (String parte : partes) {
            if (parte.length() > 0) {
                if (nomeCorrigido.length() > 0) {
                    nomeCorrigido.append("_");
                }
                nomeCorrigido.append(parte.toUpperCase());
            }
        }
        return nomeCorrigido.toString();
    }
}
