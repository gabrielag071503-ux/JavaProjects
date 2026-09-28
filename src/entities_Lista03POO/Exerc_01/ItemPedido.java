package entities_Lista03POO.Exerc_01;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Double subTotal() {
        return preco * quantidade;
    }

    @Override 
    public String toString() {
        return produto.getNome() 
        + ", R$ " 
        + String.format("%.2f", preco) 
        + ", Quantidade: " 
        + quantidade 
        + ", Subtotal: R$ " 
        + String.format("%.2f", subTotal());
    }
    
}
