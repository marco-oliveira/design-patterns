package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private String observacao;
	private List<ItensDaNota> todosItens = new ArrayList<>();
	private Calendar dataAtual;
	
	public NotaFiscalBuilder(){
		this.dataAtual = Calendar.getInstance();
	}
	
	public NotaFiscal constroi(){
		return new NotaFiscal(razaoSocial, cnpj, dataAtual, todosItens, valorBruto, imposto, observacao);
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
