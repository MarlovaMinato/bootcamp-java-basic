## Nomenclatura de Variáveis e Classes em Java

Este repositório contém um código interativo, em forma de jogo, em Java que ajuda a praticar a correta nomenclatura de variáveis e classes, conforme as convenções de codificação padrão. Abaixo está uma explicação detalhada de cada parte do código, organizada de forma didática para facilitar o entendimento de iniciantes na linguagem Java.

# Estrutura do Código
**1. Importação da Classe Scanner**
``` java
import java.util.Scanner;
```
Esta linha importa a classe **Scanner** do pacote **java.util**, permitindo a leitura de dados inseridos pelo usuário no console. O Scanner é uma ferramenta útil para capturar a entrada do usuário.

**2. Definição da Classe Principal**
```java
public class NomenclaturaDeVariaveis {
```
Declaração da classe principal chamada **NomenclaturaDeVariaveis**. Em Java, o nome de uma classe deve começar com uma letra maiúscula e seguir a convenção **PascalCase**, onde cada palavra começa com uma letra maiúscula e não há espaços entre as palavras.

**3. Método Principal** *main*
```java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
```
O método *main* é o ponto de entrada do programa. Sempre que um programa Java é executado, ele começa pelo método *main*. Aqui, criamos uma instância do **Scanner** para ler entradas do usuário.

**4. Solicitação e Correção de Nomes**
➡️Nome de Classe (**PascalCase**)
```java
        System.out.println("Digite o nome de uma classe (use PascalCase):");
        String nomeClasse = scanner.nextLine();
        nomeClasse = corrigirPascalCase(nomeClasse);
        System.out.println("Você nomeou a classe como: " + nomeClasse);
```
**System.out.println**: Exibe uma mensagem no console solicitando ao usuário que insira o nome de uma classe seguindo a convenção PascalCase.
**scanner.nextLine()**: Lê a linha de entrada do usuário.
**corrigirPascalCase(nomeClasse)**: Chama o método corrigirPascalCase para ajustar o nome inserido pelo usuário à convenção PascalCase.
**System.out.println**: Exibe o nome da classe corrigido.

➡️Nome de Variável de Instância (**camelCase**)
```java
        System.out.println("Digite o nome de uma variável de instância (use camelCase):");
        String nomeVariavelInstancia = scanner.nextLine();
        nomeVariavelInstancia = corrigirCamelCase(nomeVariavelInstancia);
        System.out.println("Você nomeou a variável de instância como: " + nomeVariavelInstancia);
```
**System.out.println**: Solicita ao usuário que insira o nome de uma variável de instância seguindo a convenção camelCase.
**scanner.nextLine()**: Lê a entrada do usuário.
**corrigirCamelCase(nomeVariavelInstancia)**: Ajusta o nome inserido à convenção camelCase.
**System.out.println**: Exibe o nome da variável de instância corrigido.

➡️Nome de Método (**camelCase**)
```java
        System.out.println("Digite o nome de um método (use camelCase):");
        String nomeMetodo = scanner.nextLine();
        nomeMetodo = corrigirCamelCase(nomeMetodo);
        System.out.println("Você nomeou o método como: " + nomeMetodo);
```
**System.out.println**: Solicita ao usuário que insira o nome de um método seguindo a convenção camelCase.
**scanner.nextLine()**: Lê a entrada do usuário.
**corrigirCamelCase(nomeMetodo)**: Ajusta o nome inserido à convenção camelCase.
**System.out.println**: Exibe o nome do método corrigido.

➡️Nome de Parâmetro (**camelCase**)
```java
        System.out.println("Digite o nome de um parâmetro (use camelCase):");
        String nomeParametro = scanner.nextLine();
        nomeParametro = corrigirCamelCase(nomeParametro);
        System.out.println("Você nomeou o parâmetro como: " + nomeParametro);
```
**System.out.println**: Solicita ao usuário que insira o nome de um parâmetro de método seguindo a convenção camelCase.
**scanner.nextLine()**: Lê a entrada do usuário.
**corrigirCamelCase(nomeParametro)**: Ajusta o nome inserido à convenção camelCase.
**System.out.println**: Exibe o nome do parâmetro corrigido.

➡️Nome de Constante (**UPPER_SNAKE_CASE**)
```java
        System.out.println("Digite o nome de uma constante (use UPPER_SNAKE_CASE):");
        String nomeConstante = scanner.nextLine();
        nomeConstante = corrigirUpperSnakeCase(nomeConstante);
        System.out.println("Você nomeou a constante como: " + nomeConstante);
```
**System.out.println**: Solicita ao usuário que insira o nome de uma constante seguindo a convenção UPPER_SNAKE_CASE.
**scanner.nextLine()**: Lê a entrada do usuário.
**corrigirUpperSnakeCase(nomeConstante)**: Ajusta o nome inserido à convenção UPPER_SNAKE_CASE.
**System.out.println**: Exibe o nome da constante corrigido.

**5. Exemplo de Uso dos Nomes Fornecidos**
```java
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
```
**System.out.println**: Exibe uma mensagem informando que um exemplo de código será mostrado utilizando os nomes fornecidos pelo usuário.
As próximas linhas de **System.out.println** constroem e exibem um exemplo de código Java utilizando os nomes fornecidos para classe, variável de instância, método, parâmetro e constante.

**6. Fechamento do** *Scanner*
```java
        scanner.close();
```
Fecha o Scanner para liberar os recursos. É uma boa prática fechar o Scanner quando ele não é mais necessário.


**7. Métodos de Correção de Nomenclatura**
*corrigirPascalCase*
```java
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

    }
```
Este método ajusta a entrada para seguir o padrão **PascalCase**, onde cada palavra começa com uma letra maiúscula e o restante das letras são minúsculas.

**split(" ")**: Divide a string em partes separadas por espaços.
**StringBuilder**: Usado para construir a nova string corrigida. O StringBuilder é usado porque é mais eficiente para concatenar strings do que usar diretamente o operador +.
**for (String parte : partes)**: Itera sobre cada parte da string dividida. Um loop *for* é usado para iterar sobre cada parte do array *partes*. Cada parte é uma palavra da string original.
**if (!parte.isEmpty()) {**: Este *if* verifica se a parte não está vazia. Isso é importante para evitar erros ao tentar acessar caracteres de uma string vazia.
**if (Character.isUpperCase(parte.charAt(0))) {**: Converte o primeiro caractere de cada parte para maiúscula. Se a primeira letra da *parte* já for maiúscula, a *parte* é adicionada ao 'StringBuilder' 'nomeCorrigido' sem alterações.
** } else {** caso contrário
**Character.toUpperCase(parte.charAt(0))** converte a primeira letra para maiúscula e a adiciona ao 'StringBuilder'.
Se a parte tem mais de um caractere, o resto da parte **(parte.substring(1))** é convertido para minúsculas **(toLowerCase())** e adicionado ao 'StringBuilder'.
**substring(1).toLowerCase()**: Converte o restante da parte para minúscula.
**return nomeCorrigido.toString()**: o método retorna a string corrigida, convertendo o 'StringBuilder' de volta para uma String usando o método 'toString()'.
A linha comentada *.trim()* pode ser usada para remover espaços em branco extras no final da string, caso haja algum.

*corrigirCamelCase*
```java
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
```
Este método ajusta a entrada para seguir o padrão **camelCase**, onde a primeira palavra começa com uma letra minúscula e cada palavra subsequente começa com uma letra maiúscula.

**split(" ")**: Divide a string em partes separadas por espaços.
**StringBuilder**: Usado para construir a nova string corrigida.
**append(partes[0].toLowerCase())**: Adiciona a primeira parte em minúsculas.
**for (int i = 1; i < partes.length; i++)**: Itera sobre as partes restantes.
**Character.toUpperCase**: Converte o primeiro caractere de cada parte subsequente

## Como Funciona

# Entrada do Usuário:
- O usuário digita os nomes conforme solicitado.
- Correção Automática:
Os métodos *corrigirPascalCase* e *corrigirCamelCase* corrigem os nomes digitados de acordo com as convenções de nomenclatura.
- Exibição e Exemplo:
Os nomes corrigidos são exibidos e usados para gerar um exemplo de código.

# Prática
- Execute o programa.
- Digite os nomes conforme solicitado.
- Veja como o programa corrige os nomes automaticamente e gera um exemplo de código usando esses nomes.

:pencil2:  
**_"É fazendo que se aprende a fazer aquilo que se deve aprender a fazer."_**  
*Aristóteles - Ética a Nicômaco.*  
**Até a próxima**


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
