package projetoDesignPattern2;

public class SalesInvoice implements DocumentoFiscal {
    private double valor;
    private String estadoDestino;
    private String ein = "12-3456789";

    public SalesInvoice(double valor, String estadoDestino) {
        this.valor = valor;
        this.estadoDestino = estadoDestino;
    }

    @Override
    public String gerarDocumento() {
        double taxa = 0.0;
        if (estadoDestino.equalsIgnoreCase("California")) taxa = 0.0725;
        else if (estadoDestino.equalsIgnoreCase("Texas")) taxa = 0.0625;
        else if (estadoDestino.equalsIgnoreCase("Oregon")) taxa = 0.0;
        
        return String.format("Sales Invoice - EIN: %s | Sales Tax: $ %.2f", ein, valor * taxa);
    }
}
