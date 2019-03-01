package Capitulo3_Programming;

public class BankAccount {
	private Integer numcuenta;
	private String nombre;
	private Double saldo;
	
	public BankAccount() {
		
	}
	
	public BankAccount(Integer numcuenta,String nombre,Double saldo) {
		this.numcuenta=numcuenta;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	public Integer getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(Integer numcuenta) {
		this.numcuenta = numcuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double deductMonthlyFee() {
		return (this.getSaldo()-4.00);
	}
	
	public static String ExplayAccountPolicy() {
		return ("La tarifa del servicio de $4 se deducira cada mes.");
	}
	
	public String showValues() {
		return String.format("%d Cuenta, %s Nombre, %.2f Saldo, %s", this.getNumcuenta(),this.getNombre(),this.getSaldo(),ExplayAccountPolicy());
	}
	

}
