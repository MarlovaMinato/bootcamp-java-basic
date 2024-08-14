public class Main {

	public static void main(String[] args) {
        Cliente maria = new Cliente("Maria", "123.456.789-00", "Rua das Flores, 123");

        Conta cc = new ContaCorrente(maria);
        Conta poupanca = new ContaPoupanca(maria);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}