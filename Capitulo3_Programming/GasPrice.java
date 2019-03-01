package Capitulo3_Programming;

public class GasPrice {

	private Integer gasPrice;
	
	public GasPrice() {
		
	}
	public GasPrice(Integer gasPrice) {
		this.gasPrice=gasPrice;
	}

	public Integer getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(Integer gasPrice) {
		this.gasPrice = gasPrice;
	}
	
	public String precios() {
		return String.format("Si el gas es de %d por barril, los precios serian: %.2f y %.2f", this.getGasPrice(),this.getGasPrice()*0.035,this.getGasPrice()*0.040);
	}
	
}
