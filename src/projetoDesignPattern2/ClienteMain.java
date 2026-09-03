package projetoDesignPattern2;

public class ClienteMain {
    public static void main(String[] args) {
        CheckoutFactory fabricaBR = new CheckoutBrasilFactory(1000.0, true, "Pix", "80000-000");
        Checkout pedidoBR = new Checkout(fabricaBR);
        pedidoBR.finalizarPedido();

        CheckoutFactory fabricaEUA = new CheckoutEUAFactory(500.0, "Texas", "12345-6789");
        Checkout pedidoEUA = new Checkout(fabricaEUA);
        pedidoEUA.finalizarPedido();

        CheckoutFactory fabricaDE = new CheckoutAlemanhaFactory(300.0, false, "10115");
        Checkout pedidoDE = new Checkout(fabricaDE);
        pedidoDE.finalizarPedido();
    }
}