## Declaração de Variáveis e Métodos

Este repositório contém um código interativo, em forma de jogo, em Java que ajuda a praticar a correta declaração de variáveis e métodos, conforme as convenções de codificação padrão. Vamos criar um jogo simples em Java que ensina a estrutura correta para declarar variáveis e métodos. O jogo apresentará algumas declarações de variáveis e métodos ​​e pedirá ao usuário para identificar se são verdadeiras ou falsas. O usuário responderá com "V" para verdadeiro e "F" para falso, e o programa informará se a resposta está correta ou errada. Abaixo está uma explicação detalhada de cada parte do código, organizada de forma didática para facilitar o entendimento de iniciantes na linguagem Java.

# Estrutura do Código
**1. Importação da Classe Scanner**
``` java
import java.util.Scanner;
```
Esta linha importa a classe **Scanner** do pacote **java.util**, permitindo a leitura de dados inseridos pelo usuário no console. O Scanner é uma ferramenta útil para capturar a entrada do usuário.

**2. Declaração da Classe Principal**
```Java
public class JogoDeclaracaoVariaveis {
```
**3. Declara a classe principal do jogo.**
Método *main*
```Java
public static void main(String[] args) {
```
O método *main* é o ponto de entrada do programa.

**4. Criação do Scanner**
```Java
Scanner scanner = new Scanner(System.in);
```
Crie uma instância do *Scanner* para ler a entrada do usuário.

**5. Declarações de Variáveis ​​e Respostas Corretas**
```Java
String[] declaracoes = {
    "int idade = 23;",
    "double altura = 1.62;",
    "Dog spike;",
    "23 int idade = ;",
    "Dog = spike;"
};

char[] respostasCorretas = {'V', 'V', 'V', 'F', 'F'};
```
Defina um array de strings contendo declarações de variáveis ​​e um array de caracteres contendo respostas corretas para cada declaração.

**6. Instruções para o Usuário:**
```Java
System.out.println("Bem-vindo ao jogo de declaração de variáveis em Java!");
System.out.println("A estrutura correta para declarar uma variável é:");
System.out.println("Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)");
System.out.println("Responda com 'V' para verdadeiro e 'F' para falso.\n");
```
Exibe as instruções e a estrutura correta para declarar variáveis.

**7. Variável de Pontuação**
```Java
int pontuacao = 0;
```
Inicialize a variável *pontuacao* para armazenar o número de respostas corretas.

**8. Inicialização do Loop**
```Java
for (int i = 0; i < declaracoes.length; i++) {
```
- **for:** Inicia um loop que será executado várias vezes.
- **int i = 0:** Declara e inicializa a variável *i* com valor *0*. Esta variável é usada como contador do loop.
- **i < declaracoes.length:** Condição de permissão do loop. O loop continua enquanto *i* for menor que o tamanho do array *declaracoes*.
- **i++:** Incrementa a variável * i*em *1* a cada iteração do loop.

**Exposição da Declaração**
```Java
System.out.println("Declaração: " + declaracoes[i]);
```
- **System.out.println:** Imprima uma linha no console.
- **"Declaração: " + declaracoes[i]:** Concatena a string *"Declaração: "* com a declaração de método na posição *i* do array *declaracoes* e a exibe no console.

**Solicitação de Resposta**
```Java
System.out.print("Essa declaração está correta? (V/F): ");
char respostaUsuario = scanner.next().charAt(0);
```
- **System.out.print:** Imprima uma mensagem no console sem pular para a próxima linha.
- **"Essa declaração está correta? (V/F): ":** Uma mensagem solicitando que o usuário digite "V" para verdadeiro ou "F" para falso.
- **char respostaUsuario = scanner.next().charAt(0):**
-  scanner.next(): Leia a próxima entrada do usuário como uma string.
- charAt(0): Obtenha o primeiro caractere da string digitada pelo usuário.
- **char respostaUsuario:** Armazena esse caractere na variável *respostaUsuario*.

**Verificação da Resposta**
```Java
if (respostaUsuario == respostasCorretas[i]) {
    System.out.println("Correto!\n");
    pontuacao++;
} else {
    System.out.println("Errado.\n");
}
```
**if (respostaUsuario == respostasCorretas[i]):**
- **respostaUsuario:** A resposta fornecida pelo usuário.
- **respostasCorretas[i]:** A resposta correta corresponde à declaração na posição *i* do array *declaracoes*.
- Verificar se a resposta do usuário ( respostaUsuario) é igual à resposta correta ( respostasCorretas[i]).

Se a resposta estiver correta:

- **System.out.println("Correto!\n");:** Exibe a mensagem *"Correto!"* seguida de uma nova linha.
- **pontuacao++:** Incrementa a variável *pontuacao* em *1*.

Se a resposta for incorreta :

- **System.out.println("Errado.\n");:** Exiba a mensagem "Errado". seguida de uma nova linha.

**9. Exposição da Pontuação Final**
```Java
System.out.println("Jogo finalizado! Você acertou " + pontuacao + " de " + declaracoes.length + " declarações.");
```
Exibe a pontuação final do usuário.

**10. Fechamento do Scanner**
```Java
scanner.close();
```
Data ou hora *Scanner* de liberar os recursos associados.

## Prática

- Passo 1 : Execute o programa no seu ambiente de desenvolvimento Java.
- Passo 2 : Para cada declaração aplicada, digite "V" se você acha que a declaração está correta ou "F" se você acha que está errado.
- Passo 3 : O programa verificará sua resposta e fornecerá feedback imediato, indicando se você acertou ou errou.
- Passo 4 : Veja sua conclusão ao final para avaliar seu desempenho na prática de identificação de declarações de métodos corretas em Java.

:pencil2:  
**_"É fazendo que se aprende a fazer aquilo que se deve aprender a fazer."_**  
*Aristóteles - Ética a Nicômaco.*  
**Até a próxima**

