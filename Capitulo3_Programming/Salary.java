package Capitulo3_Programming;

public class Salary {

	private Integer pagoxhora;
	private Integer horasregulares;
	private Integer horasextras;
	
	
	public Salary() {
		
	}
	
	public Salary(Integer pagox,Integer horasregu,Integer horasex) {
		this.pagoxhora=pagox;
		this.horasregulares=horasregu;
		this.horasextras=horasex;
	}
	public Integer getPagoxhora() {
		return pagoxhora;
	}
	public void setPagoxhora(Integer pagoxhora) {
		this.pagoxhora = pagoxhora;
	}
	public Integer getHorasregulares() {
		return horasregulares;
	}
	public void setHorasregulares(Integer horasregulares) {
		this.horasregulares = horasregulares;
	}
	public Integer getHorasextras() {
		return horasextras;
	}
	public void setHorasextras(Integer horasextras) {
		this.horasextras = horasextras;
	}
	
	public Double pagohorex() {
		return ((this.getHorasregulares()*this.getPagoxhora()*5)+(this.getHorasextras()*this.getPagoxhora()*1.5*5));
	}
	
	
}
