package Encapsulamento;

public class ObejtoProduto {

	public static void main(String[] args) {
	Produto prod = new Produto ("Queijo Prato", 50.00);
	 
	//mostra valores iniciais
	System.out.println(prod.getNome()+ " "+ prod.getPreco());

	prod.setPreco(53);
	System.out.println(prod.getPreco());
	
	prod.setPreco(56);
	System.out.println(prod.getPreco());
	
	prod.setNome("Queijo Pamesão");
	prod.setPreco(80);
	System.out.println(prod.getNome());
	System.out.println(prod.getPreco());
	
	}

}
