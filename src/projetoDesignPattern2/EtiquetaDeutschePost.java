package projetoDesignPattern2;

public class EtiquetaDeutschePost implements EtiquetaEnvio {
    private String plz;

    public EtiquetaDeutschePost(String plz) {
        this.plz = plz;
    }

    @Override
    public String gerarEtiqueta() {
        return "Deutsche Post - PLZ: " + plz;
    }
}
