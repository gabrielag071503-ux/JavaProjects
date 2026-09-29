package entities_DesafioProva01;

public class ItensNota {
    private Integer quantidade;
    private Double preco;
    private Produto produto;


    public ItensNota() {
    }


    public ItensNota(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }


    public Integer getQuantidade() {
        return quantidade;
    }


    public Double getPreco() {
        return preco;
    }

    public Produto geProduto() {
        return produto;
    }

    public Double subTotal() {
        return preco * quantidade;
    }


    @Override
    public String toString() {
        return "\nProduto: " 
        + produto.getNome() 
        + ", quantidae: " 
        + quantidade 
        + ", preço: " 
        + preco 
        + ", Valor: " 
        + String.format("%.2f", subTotal());
    }

    
}
