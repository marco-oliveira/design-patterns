package builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String empresa;
	private String cnpj;
	private Calendar dataEntrada;
	private List<ItensDaNota> itens;
	private double valorBruto;
	private double imposto;
	private String observacoes;
	
	public NotaFiscal(String empresa, String cnpj, Calendar dataEntrada,
			List<ItensDaNota> itens, double valorBruto, double imposto,
			String observacoes) {
		this.empresa = empresa;
		this.cnpj = cnpj;
		this.dataEntrada = dataEntrada;
		this.itens = itens;
		this.valorBruto = valorBruto;
		this.imposto = imposto;
		this.observacoes = observacoes;
	}

	public String getEmpresa() {
		return empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataEntrada() {
		return dataEntrada;
	}

	public List<ItensDaNota> getItens() {
		return itens;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public String getObservacoes() {
		return observacoes;
	}

	@Override
	public String toString() {
		return String.format("Razão: %-10s\nCNPJ: %-10s\nValor Bruto: %-10.2f ", this.empresa, this.cnpj, this.valorBruto);
	}
	
}
