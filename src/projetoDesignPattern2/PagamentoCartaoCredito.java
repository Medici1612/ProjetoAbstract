package projetoDesignPattern2;

public class PagamentoCartaoCredito implements ProcessamentoPagamento {
    private double valor;

    public PagamentoCartaoCredito(double valor) {
        this.valor = valor;
    }

    @Override
    public String processar() {
        return String.format("Credit Card processed for $ %.2f with AVS verification.", valor);
    }
}
