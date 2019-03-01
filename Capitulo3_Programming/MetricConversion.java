package Capitulo3_Programming;

public class MetricConversion {

	private Integer valor;
	
	public MetricConversion() {
		
	}
	
	public MetricConversion(Integer valor) {
		this.valor=valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public String pulCent() {
		return String.format("%d pulgas son %.2f centimentros", valor,valor*2.54);
	}
	
	public String galLit() {
		return String.format("%d galones son %.2f litros",valor,valor*3.7854);
	}
	
	
}
