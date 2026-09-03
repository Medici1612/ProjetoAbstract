package projetoDesignPattern2;

public class CheckoutEUAFactory implements CheckoutFactory {
    private double valor;
    private String estadoDestino;
    private String zipCode;

    public CheckoutEUAFactory(double valor, String estadoDestino, String zipCode) {
        this.valor = valor;
        this.estadoDestino = estadoDestino;
        this.zipCode = zipCode;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new SalesInvoice(valor, estadoDestino);
    }

    @Override
    public ProcessamentoPagamento criarProcessamentoPagamento() {
        return new PagamentoCartaoCredito(valor);
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaUSPS(zipCode);
    }
}
