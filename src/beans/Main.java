package beans;

public class Main {
	public static void main(String[] args) {
		
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");
		
		Conta cc = new ContaCorrente(carlos);
		Conta cp = new ContaPoupanca(carlos);
		
		//Conta Corrente
		cc.depositar(100);
		//Conta Poupança
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}
}
