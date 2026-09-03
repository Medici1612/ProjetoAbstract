package projetoDesignPattern2;

public class VatInvoice implements DocumentoFiscal {
    private double valor;
    private boolean produtoEssencial;
    private String vatId = "DE987654321";

    public VatInvoice(double valor, boolean produtoEssencial) {
        this.valor = valor;
        this.produtoEssencial = produtoEssencial;
    }

    @Override
    public String gerarDocumento() {
        double taxa = produtoEssencial ? 0.07 : 0.19;
        return String.format("VAT Invoice - VAT-ID: %s | Umsatzsteuer: € %.2f", vatId, valor * taxa);
    }
}
