package projetoDesignPattern2;

public class CheckoutBrasilFactory implements CheckoutFactory {
    private double valor;
    private boolean interestadual;
    private String metodoPagamento;
    private String cep;

    public CheckoutBrasilFactory(double valor, boolean interestadual, String metodoPagamento, String cep) {
        this.valor = valor;
        this.interestadual = interestadual;
        this.metodoPagamento = metodoPagamento;
        this.cep = cep;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NFe(valor, interestadual);
    }

    @Override
    public ProcessamentoPagamento criarProcessamentoPagamento() {
        return new PagamentoBrasil(metodoPagamento, valor);
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaCorreios(cep);
    }
}
