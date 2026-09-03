package projetoDesignPattern2;

public interface CheckoutFactory {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessamentoPagamento criarProcessamentoPagamento();
    EtiquetaEnvio criarEtiquetaEnvio();
}
