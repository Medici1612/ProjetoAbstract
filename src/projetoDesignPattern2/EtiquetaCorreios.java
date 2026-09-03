package projetoDesignPattern2;

public class EtiquetaCorreios implements EtiquetaEnvio {
    private String cep;

    public EtiquetaCorreios(String cep) {
        this.cep = cep;
    }

    @Override
    public String gerarEtiqueta() {
        return "Correios - CEP: " + cep;
    }
}
