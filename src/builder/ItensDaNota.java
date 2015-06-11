package builder;

public class ItensDaNota {
	private String nome;
	private double valor;

	public ItensDaNota(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
}
