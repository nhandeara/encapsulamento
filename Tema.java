package Encapsulamento;

public class Tema {
	private String nome;
	private String cortoalha;
	private double valoraluguel;
	private int id;
	
	public Tema() {
	}
		//construtor
	public Tema(String nome, String cortoalha,double valoraluguel, int id) {
		 this.id = id;
	        this.nome = nome;
	        this.valoraluguel = valoraluguel;
	        this.cortoalha = cortoalha;
		
			
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
			this.nome=nome;
	}
	public String getCortoalha() {
		return cortoalha;
	}
	public void setCortoalha(String cortoalha) {
		this.cortoalha=cortoalha;
	}
	public double getValoraluguel() {
		return valoraluguel;
	}
	public void setValoraluguel(double Valoraluguel) {
		this.valoraluguel=valoraluguel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	
	public void valoraluguel(double valoraluguel) {
		 if (id >= 0) {
    		 valoraluguel += id;
    	 }else {
    		 System.out.println("aluguel invalido!");
    	 }
    	 }
     
	   public void setvaloraluguel(double valoraluguel) {
	        if (valoraluguel >= 0) { // Validação simples
	            this.valoraluguel = valoraluguel;
	        } else {
	            System.out.println("Valor do aluguel não pode ser negativo.");
	        }
	    }
}
