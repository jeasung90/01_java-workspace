package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electrinic{

	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop () {}
	
	public Desktop (String brand,String name,int price,String CPU, String graphic) {
		super(brand, name, price);
		this.graphic=graphic;
	}
	
	public String getGraphic() {
		return graphic;
	}
	public void setGraphiv(String graphic) {
		this.graphic=graphic;
	}
	
	@Override
	public String toString() {
		return super.toString()+", graphic : "+graphic;
		
		
		
	}
	
	
	
	
}
