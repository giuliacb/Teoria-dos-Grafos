package iesb.tg2024.devLab2;

public class Vertice {
	
	private String rotulo;
	public String getRotulo() {
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	private int grau = 0;
	
	//construtor
	public Vertice(String rotulo) throws Exception{
		boolean isRotuloEmBranco = rotulo == null || rotulo != null && "".equals(rotulo.trim());
		
		if(isRotuloEmBranco) {
			throw new Exception ("não podemos criar vértice sem rotulo");
		}
		this.rotulo = rotulo;
	}
	
	public void addGrau() {
		this.grau++;
	}


}

