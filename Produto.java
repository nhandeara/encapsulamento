package Encapsulamento;

public class Produto {
	//atributos privados 
	private String nome;
	private double preco;
	
	//construtor
	public Produto(String nome, double preco) {
		this.nome = nome ;
		setPreco(preco);
			
	}
	
	//Getter para o nome
	public String getNome() {
		return nome;
	}
	
	//setter para o nome
	public void setNome(String nome) {
		this.nome=nome;
	}
	//Getter para o preço 
	public double getPreco() {
		return preco;
	}
	
	//Setter para o preço com validação 
	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		}else {
			System.out.println("Preço invalido!Não pode ser negativo.");
		}
	}
	//Metodo para exibir informações do produto
	public void exibirInformcoes() {
		System.out.println("Produto:" + nome +", preço:" +preco); 
	}
  	

}
