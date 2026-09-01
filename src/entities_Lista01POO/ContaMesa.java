package entities_Lista01POO;

public class ContaMesa {
    private int numeroMesa;
    private int qtdPessoas;
    private double kgComida;
    private int qtdSobremesa;
    private int qtdCerveja;
    private int qtdRefrigerante;

    private double valorTotal;
    private double valorPorPessoa;

    public ContaMesa(int numeroMesa, int qtdPessoas ) {
        this.numeroMesa = numeroMesa;
        if (qtdPessoas > 0){
            this.qtdPessoas = qtdPessoas;
        } else {
            this.qtdPessoas = 1;
        }

        this.kgComida = 0.0;
        this.qtdSobremesa = 0;
        this.qtdCerveja = 0;
        this.qtdRefrigerante = 0;
    }


    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public double getKgComida() {
        return kgComida;
    }

    public int getQtdSobremesa() {
        return qtdSobremesa;
    }

    public int getQtdCerveja() {
        return qtdCerveja;
    }

    public int getQtdRefrigerante() {
        return qtdRefrigerante;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorPorPessoa() {
        return valorPorPessoa;
    }

    public void adicionarPessoas( int novasPessoas) {
        if (qtdPessoas > 0) {
            this.qtdPessoas += novasPessoas;
        } else {
            System.out.println("ERRO!A quantidade de novas pessoas deve ser maior que zero.");
        }
    }

    public void adicionarComida(double pesoKG) {
        if (pesoKG > 0) {
            this.kgComida += pesoKG;
        } else {
            System.out.println("ERRO!A quantida de comida deve ser maior que zero.");
        }
    }

    public void adicionarSobremesa(int quantidade) {
        if (quantidade > 0) {
            this.qtdSobremesa += quantidade;
        }
    }

    public void adicionarRefrigerante(int quantidade) {
        if (quantidade > 0) {
            this.qtdRefrigerante += quantidade;
        }
    }

    public void adicionarCerveja(int quantidade) {
        if (quantidade > 0) {
            this.qtdCerveja += quantidade;
        }
    }

    public void fecharConta() {
        double custoComida = kgComida * 30.00;
        double custoSobremesa = qtdSobremesa * 6.00;
        double custoRefigerante = qtdRefrigerante * 5.00;
        double custoCerveja = qtdCerveja * 10.00;

        this.valorTotal = custoComida + custoSobremesa + custoCerveja + custoRefigerante;

        if(this.qtdPessoas > 0) {
            this.valorPorPessoa = this.valorTotal / this.qtdPessoas;
        } else {
            this.valorPorPessoa = 0.0;
        }
    }

    public void emitirNotaFiscal() {
        System.out.println("_______NOTA FISCAL_______");
        System.out.println("Mesa " + numeroMesa);
        System.out.println("Quantidade de pessoas: " + qtdPessoas);
        System.out.printf("Valor total: R$%.2f%n ", valorTotal);
        System.out.printf("Valor por pessoa: R$%.2f%n ", valorPorPessoa);
        System.out.println("__________________________");
    }


}
