package projetoDesignPattern2;

public class NFe implements DocumentoFiscal {
    private double valor;
    private boolean interestadual;

    public NFe(double valor, boolean interestadual) {
        this.valor = valor;
        this.interestadual = interestadual;
    }

    @Override
    public String gerarDocumento() {
        String cfop = interestadual ? "6.102" : "5.102";
        double taxaIcms = interestadual ? 0.12 : 0.18;
        double valorIcms = valor * taxaIcms;
        String chave = "12345678901234567890123456789012345678901234";
        return String.format("NFe - CFOP: %s | ICMS: R$ %.2f | Chave: %s", cfop, valorIcms, chave);
    }
}