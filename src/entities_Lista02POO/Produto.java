package entities_Lista02POO;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque() {

        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {

        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {

        this.quantidade -= quantidade;
    }

    public String toString() {
        return String.format("%s, R$ %.2f, %d unidades, Total: R$ %.2f",
                nome, preco, quantidade, valorTotalEstoque());
    }
}
