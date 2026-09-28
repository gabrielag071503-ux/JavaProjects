package entities_Lista03POO.Exerc_01;

public enum StatusPedido {
    PAGAMENTO_PENDENTE(0),
    PROCESSANDO(1),
    ENVIADO(2),
    ENTREGUE(3);

    private int codigo;

    private StatusPedido (int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
