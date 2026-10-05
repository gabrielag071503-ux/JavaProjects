package entities_DesafioProva01;

import java.util.ArrayList;
import java.util.List;

public class NotaVenda {
    private String data;
    private Integer numero;

    private Cliente cliente;
    private List<ItensNota> itens = new ArrayList<>();

    public NotaVenda(String data, Integer numero, Cliente cliente) {
        this.data = data;
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensNota> getItens() {
        return itens;
    }

    public void addItem (ItensNota item) {
        itens.add(item);
    }

    public void removeItem (ItensNota item) {
        itens.remove(item);
    }

    public Double total() {
        double total = 0.0;
        for (ItensNota item : itens) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "Momento do pedido: " + data + ", Número: " + numero + "\n";
        texto += cliente + "\n";
        texto += "Itens do pedido:\n";
        for (ItensNota item : itens) {
            texto += item + "\n";
        }
        texto += "Total da nota: R$" + String.format("%.2f", total());
        return texto;
    }

    
    
    
}
