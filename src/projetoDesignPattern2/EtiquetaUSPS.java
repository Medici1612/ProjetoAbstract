package projetoDesignPattern2;

public class EtiquetaUSPS implements EtiquetaEnvio {
    private String zipCode;

    public EtiquetaUSPS(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String gerarEtiqueta() {
        return "USPS - ZIP+4: " + zipCode;
    }
}