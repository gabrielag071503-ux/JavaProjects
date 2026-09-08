package entities_Lista02POO;

public class ConversorMoeda{
    public static final double IOF = 0.06;
    private double cotacaoDolar;
	private double quantidadeDolares;

    public ConversorMoeda(double cotacaoDolar, double quantidadeDolares) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

     public void setCotacaoDolar(double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}

        public double getQuantidadeDolares() {
		return quantidadeDolares;
	}

    	public void setQuantidadeDolares(double quantidadeDolares) {
		this.quantidadeDolares = quantidadeDolares;
	}

    public double valorSemImposto() {
		return cotacaoDolar * quantidadeDolares;
    }

    public double valorComIOF() {
			return valorSemImposto() + (valorSemImposto() * IOF);
    }

    @Override 
    public String toString() {
        return "O valor a ser pago em reais = " + String.format("%.2f", valorComIOF());
    }

}