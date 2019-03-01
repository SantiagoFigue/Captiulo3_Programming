package Capitulo3_Programming;

public class Sandwich {

	private String principal;
	private String pan;
	private Double precio;
	
	public Sandwich(String principal, String pan, Double precio) {
		this.principal=principal;
		this.pan=pan;
		this.precio=precio;
	}
	
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public String ticket() {
		return String.format("El sandwich es de %s con pan %s y un precio de %.2f", this.getPrincipal(),this.getPan(),this.getPrecio());
	}
	
}
