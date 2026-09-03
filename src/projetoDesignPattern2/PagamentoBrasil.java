package projetoDesignPattern2;

public class PagamentoBrasil implements ProcessamentoPagamento {
    private String metodo;
    private double valor;

    public PagamentoBrasil(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
    }

    @Override
    public String processar() {
        if (metodo.equalsIgnoreCase("Pix")) {
            return String.format("Pagamento Pix processado. Valor: R$ %.2f", valor * 0.95);
        } else {
            return String.format("Pagamento Boleto gerado. Valor: R$ %.2f (Compensação em 3 dias)", valor);
        }
    }
}
