
public class Electrodomestico {

	private int precio_base = 100;
	private String color = "blanco";
	private String consumo_energetico = "F";
	private int peso = 5;
	
	
	public Electrodomestico(String color, int peso,int precio_base,String consumo_energetico){
		this.color=color;
		this.peso=peso;
		this.precio_base=precio_base;
		this.consumo_energetico=consumo_energetico;
	}
	
	public Electrodomestico(int precio_base,int peso){
		this.peso=peso;
		this.precio_base=precio_base;
	}
	

public String getColor() {
	return color;
}
public int getPeso() {
	return peso;
}
public String getConsumo_energetico() {
	return consumo_energetico;
}
public int getPrecio_base() {
	return precio_base;
}
public void setColor(String color) {
	this.color = color;
}
public void setConsumo_energetico(String consumo_energetico) {
	this.consumo_energetico = consumo_energetico;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public void setPrecio_base(int precio_base) {
	this.precio_base = precio_base;
}

	}
	
	

