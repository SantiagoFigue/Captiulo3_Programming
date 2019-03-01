package Capitulo3_Programming;

public class Percentages {
	
	private Double numero1=2.0;
	private Double numero2=2.0;
	
	
	public Percentages() {
		
	}
	
	public Percentages(Double numero1,Double numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public Double getNumero1() {	
		return numero1;
	}
	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}
	public Double getNumero2() {
		return numero2;
	}
	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}
	
	public String porcentajes() {
		return String.format("%.2f es %.0f  de %.2f",numero1, (numero1/numero2)*100,numero2);
	}
	
	

}
