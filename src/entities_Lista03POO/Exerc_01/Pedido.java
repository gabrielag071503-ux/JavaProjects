package entities_Lista03POO.Exerc_01;

import java.util.ArrayList;

public class Pedido {
    private java.util.Date momento;
    private String status;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public Pedido(java.util.Date momento, String status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public void addItem(ItemPedido item) {
        itens.add(item);
    }

    public void removeItem(ItemPedido item) {
        itens.remove(item);
    }

    public double total() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido:\n");
        sb.append("Momento: " + momento + "\n");
        sb.append("Status: " + status + "\n");
        sb.append("Cliente: " + cliente.getNome() + " (" + cliente.getDataNascimento() + ") - " + cliente.getEmail() + "\n");
        sb.append("Itens do pedido:\n");
        for (ItemPedido item : itens) {
            sb.append(item.toString() + "\n");
        }
        sb.append("Total: R$ " + String.format("%.2f", total()));
        return sb.toString();
    }

    
}
