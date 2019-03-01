package Capitulo3_Programming;

public class Interest {
	private Integer valInicial;

	public Interest() {
		
	}
	
	public Interest(Integer valInicial) {
		this.valInicial=valInicial;
	}
	
	public Integer getValInicial() {
		return valInicial;
	}

	public void setValInicial(Integer valInicial) {
		this.valInicial = valInicial;
	}
	
	public Double total() {
		return ((this.getValInicial()*0.05)+this.getValInicial());
	}
	

}
