package entities_Lista03POO.Exerc_01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss" );
    private Date momento;
    private StatusPedido status;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public StatusPedido getStatus () {
        return status;
    }

    public void setStatus (StatusPedido status) {
        this.status = status;
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
        String texto = "momento do Pedido: " + sdf.format(momento)+ "\n";
        texto += "Status do Pedido: " + status + "\n";
        texto += "Cliente: " + cliente.getNome() + " ( " + cliente.getDataNascimento() + " ) " + " - " + cliente.getEmail() + "\n";
        texto += "Itens do Pedido: \n";
        for (ItemPedido item : itens) {
            texto += item.toString() + "\n";
        }
        return texto;
    }

    
}
