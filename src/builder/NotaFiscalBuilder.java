package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private String observacao;
	private List<ItensDaNota> todosItens = new ArrayList<>();
	private Calendar dataAtual;
	List<AcaoAposGerarNota> acoes;
	
	public NotaFiscalBuilder(){
		this.dataAtual = Calendar.getInstance();
		this.acoes = new ArrayList<AcaoAposGerarNota>();
		
	}
	
	
	public void adicionaAcoes(AcaoAposGerarNota acao){
		this.acoes.add(acao);
	}
	
	public NotaFiscal constroi(){
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataAtual, todosItens, valorBruto, imposto, observacao);
		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(notaFiscal);
		}
		return notaFiscal;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String obs){
		this.observacao = obs;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data){
			this.dataAtual = data;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItensDaNota item){
		todosItens.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor()*0.05;
		return this;
	}

}
