package Encapsulamento;

public class ContaBancaria {
	//atributo privado 
	private double saldo;
	 
	//construtor para inicializar o saldo
	public ContaBancaria (double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo= saldoInicial;
		}else {
			this.saldo = 0;
		}
		
	}
    //Getter para o saldo
     public double getSaldo() {
    return saldo;
}
//Metodo para depositar dinheiro (só aceita valores positivos)
     public void depositar(double valor) {
    	 if (valor >= 0) {
    		 saldo +=valor;
    	 }else {
    		 System.out.println("valor de deposito invalido!");
    	 }
    	 }
     //metodo para sacar dinheiro(nao pode sacar mais do que o saldo)
     public void sacar(double valor) {
    	 if(valor > 0 && valor<=saldo) {
    		 saldo-=valor;
    	 }else {
    		 System.out.println("Saque invalido! verifique o valor");
    	 }
     }
}