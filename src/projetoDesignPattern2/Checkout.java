package projetoDesignPattern2;

public class Checkout {
    private DocumentoFiscal documentoFiscal;
    private ProcessamentoPagamento processamentoPagamento;
    private EtiquetaEnvio etiquetaEnvio;

    public Checkout(CheckoutFactory factory) {
        this.documentoFiscal = factory.criarDocumentoFiscal();
        this.processamentoPagamento = factory.criarProcessamentoPagamento();
        this.etiquetaEnvio = factory.criarEtiquetaEnvio();
    }

    public void finalizarPedido() {
        System.out.println("--- Relatório de Checkout ---");
        System.out.println(documentoFiscal.gerarDocumento());
        System.out.println(processamentoPagamento.processar());
        System.out.println(etiquetaEnvio.gerarEtiqueta());
        System.out.println("-----------------------------\n");
    }
}