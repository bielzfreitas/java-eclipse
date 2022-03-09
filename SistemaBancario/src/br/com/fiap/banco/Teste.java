package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//modificado para padrão JavaBeans

		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());
		
		
		
//		Conta cc = new Conta();
//		cc.depositar(50.0);
//		cc.setAgencia(123);
//		cc.setNumero(321);
//		
//		cc.depositar(1000);
//		
//		System.out.println(cc.getSaldo());
//	
//		//passando o numero, agencia e saldo
//		Conta poupanca = new Conta(111, 222, 1000);
//		poupanca.retirar(50);
//		
//		System.out.println(poupanca.getSaldo());
	}

}
