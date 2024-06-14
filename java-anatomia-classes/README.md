## Getting Started

# MinhaClasse

Esta etapa do projeto contém um exemplo didático de uma classe em Java, chamada `MinhaClasse`, que imprime uma mensagem no console. Abaixo, segue uma descrição detalhada do funcionamento do código.

## Declaração da Classe

```java
public class MinhaClasse {
```
**public**: Modificador de acesso que permite que o método seja chamado de qualquer lugar.  
**static**: Indica que o método pertence à classe, não a instâncias da classe.  
**void**: O método não retorna nenhum valor.  
**main**: Nome do método principal, padrão de entrada para execução de programas Java.  
**String[] args**: Parâmetro que pode receber argumentos de linha de comando, representado como um array de strings.

Aqui, a função **main** é o ponto de entrada para a execução do programa Java. Ela inicia a execução do código e realiza a impressão da seguinte mensagem no console:

```java
System.out.println("Olá, amigos do saber!");
```

**System.out**: Objeto que representa a saída padrão (geralmente o console).
**println**: Método que imprime a mensagem seguida de uma nova linha.
**"Olá, amigos do saber!"**: A mensagem de texto que será impressa.


## Como Executar

Para executar o programa `MinhaClasse`, siga os passos abaixo:

1. Salve o código acima em um arquivo chamado `MinhaClasse.java`.
2. Compile o arquivo usando o compilador Java:
   
 ```sh
 javac MinhaClasse.java
 ```
 3. Execute o programa compilado:
```sh    
java MinhaClasse
```
Ao executar o programa, você verá a seguinte saída no console:

```arduino
Olá, amigos do saber!
```


:pencil2:  
**_"É fazendo que se aprende a fazer aquilo que se deve aprender a fazer."_**  
*Aristóteles - Ética a Nicômaco.*  
**Até a próxima**





## VS Code Java world 

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
