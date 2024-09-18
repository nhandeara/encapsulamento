package Encapsulamento;

public class ItemTema {
	private int id;
	private String nome;
	private String descricao;
	public ItemTema(int id, String nome, String descricao) {
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id; }
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getDescricao() {
	return descricao;
	}
	public void setDescricao(String descricao) {
	this.descricao = descricao;
	}
	public void exibirInformacoes() {
	System.out.println("ID: " + id + ", Nome: " + nome + ", Descrição: " + descricao);
	}
	}