package entities_Lista03POO.Exerc_01;

public class ItemPedido {
    private Integer quantidade;
    private double preco;
    private Produto produto;

    public ItemPedido(Integer quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public double subTotal() {
        double subTotal = preco * quantidade;
        return subTotal;
    }

    @Override 
    public String toString() {
        return produto.getNome() + ", R$ " + String.format("%.2f", preco) + ", Quantidade: " + quantidade + ", Subtotal: R$ " + String.format("%.2f", subTotal());
    }
    
}
