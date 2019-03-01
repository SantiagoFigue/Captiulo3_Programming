package Capitulo3_Programming;

public class Painting {

	private String pintura;
	private String nombre;
	private String medio;
	private Double precio;
	private Double comision;
	
	
	public Painting() {
		this.pintura="Monalisa";
		this.nombre="Leonardo Da Vinci";
		this.medio="Rojo";
		this.precio=250008.9;
		this.comision=(this.precio*0.2);
	}
	
	public Painting(String pintura, String nombre, String medio, Double precio, Double comision) {
		this.pintura=pintura;
		this.nombre=nombre;
		this.medio=medio;
		this.precio=precio;
		this.comision=comision;
	}
	public String getPintura() {
		return pintura;
	}
	public void setPintura(String pintura) {
		this.pintura = pintura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMedio() {
		return medio;
	}
	public void setMedio(String medio) {
		this.medio = medio;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getComision() {
		return comision;
	}
	public void setComision(Double comision) {
		this.comision = comision;
	}
	
	
	
}
