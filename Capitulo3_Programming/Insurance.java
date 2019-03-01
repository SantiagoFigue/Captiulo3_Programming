package Capitulo3_Programming;

public class Insurance {

	private Integer añoactual;
	private Integer añonacido;
	
	public Insurance() {
		
	}
	
	public Insurance(Integer añoactual,Integer añonacido) {
		this.añoactual=añoactual;
		this.añonacido=añonacido;
	}
	
	public Integer getAñoactual() {
		return añoactual;
	}
	public void setAñoactual(Integer añoactual) {
		this.añoactual = añoactual;
	}
	public Integer getAñonacido() {
		return añonacido;
	}
	public void setAñonacido(Integer añonacido) {
		this.añonacido = añonacido;
	}
	
	public Integer poiliza() {
		return ((añoactual-añonacido)/10+15)*20;
	}
	
	
}
