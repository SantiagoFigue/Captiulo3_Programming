package Capitulo3_Programming;

public class ArithmeticMethods {

	private Integer x=5;
	private Integer y=5;
	
	public ArithmeticMethods() {
		
	}
	public ArithmeticMethods(Integer x, Integer y) {
		this.x=x;
		this.y=y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public String displayNumberPlus10() {
		return String.format("%d,%d", this.getX()+10,this.getY()+10);
	}
	
	public String displayNumberPlus100() {
		return String.format("%d, %d", this.getX()+100,this.getY()+100);
	}
	
	public String displayNumberPlus1000() {
		return String.format("%d,%d", this.getX()+1000,this.getY()+1000);
	}
	
	
	
}
