package Capitulo3_Programming;

public class Insurance {

	private Integer a�oactual;
	private Integer a�onacido;
	
	public Insurance() {
		
	}
	
	public Insurance(Integer a�oactual,Integer a�onacido) {
		this.a�oactual=a�oactual;
		this.a�onacido=a�onacido;
	}
	
	public Integer getA�oactual() {
		return a�oactual;
	}
	public void setA�oactual(Integer a�oactual) {
		this.a�oactual = a�oactual;
	}
	public Integer getA�onacido() {
		return a�onacido;
	}
	public void setA�onacido(Integer a�onacido) {
		this.a�onacido = a�onacido;
	}
	
	public Integer poiliza() {
		return ((a�oactual-a�onacido)/10+15)*20;
	}
	
	
}
