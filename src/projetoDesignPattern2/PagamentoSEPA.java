package projetoDesignPattern2;

public class PagamentoSEPA implements ProcessamentoPagamento {
    private double valor;

    public PagamentoSEPA(double valor) {
        this.valor = valor;
    }

    @Override
    public String processar() {
        return String.format("SEPA Direct Debit processed for € %.2f.", valor);
    }
}