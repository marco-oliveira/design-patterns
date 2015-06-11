package builder;

public class ItensDaNotaBuilder {
	private String nome;
	private double valor;
	
	public ItensDaNota criador(){
		return new ItensDaNota(nome, valor);
	}
	
	public ItensDaNotaBuilder comNome(String nome){
		this.nome = nome;
		return this;
	}
	
	public ItensDaNotaBuilder comValor(double valor){
		this.valor = valor;
		return this;
	}
}
