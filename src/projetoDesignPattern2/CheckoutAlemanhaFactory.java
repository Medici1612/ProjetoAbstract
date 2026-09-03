package projetoDesignPattern2;

public class CheckoutAlemanhaFactory implements CheckoutFactory {
    private double valor;
    private boolean produtoEssencial;
    private String plz;

    public CheckoutAlemanhaFactory(double valor, boolean produtoEssencial, String plz) {
        this.valor = valor;
        this.produtoEssencial = produtoEssencial;
        this.plz = plz;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new VatInvoice(valor, produtoEssencial);
    }

    @Override
    public ProcessamentoPagamento criarProcessamentoPagamento() {
        return new PagamentoSEPA(valor);
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaDeutschePost(plz);
    }
}
