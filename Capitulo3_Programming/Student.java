package Capitulo3_Programming;

public class Student {
	private Integer id;
	private Integer horas;
	private Integer puntos;
	
	
	public Student() {
		this.id=9999;
		this.horas=3;
		this.puntos=12;
	}
	
	public Student(Integer id,Integer horas,Integer punto) {
		this.id=id;
		this.horas=horas;
		this.puntos=punto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
	
	public Integer promedio() {
		return (this.getPuntos()/this.getHoras());
	}
}
