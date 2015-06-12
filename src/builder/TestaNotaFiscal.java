package builder;


public class TestaNotaFiscal {
	public static void main(String[] args) {

		NotaFiscal nf = new NotaFiscalBuilder()
		.paraEmpresa("Tal e Cia")
		.comCnpj("1212121125")
		.comItem(new ItensDaNota("papel", 100.0))
		.comItem(new ItensDaNota("lapis", 200.0))
		.comItem(new ItensDaNota("caneta", 300.0))
		.comObservacao("nfe tal e tal")
		.constroi();
		System.out.println(nf);
		
	}
}
