package Encapsulamento;

public class ObjetoContgaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta= new ContaBancaria(100000.00);
		
		//saldo inicial
		System.out.println(conta.getSaldo());
		
		//deposito 
		conta.depositar(500);
		conta.depositar(1000);
		
		//mostrar saldo após 2 dépositos
		System.out.println(conta.getSaldo());
		
		//saque
		conta.sacar(1500);
		
		//mostrar após saque
		System.out.println(conta.getSaldo());

	}

}
