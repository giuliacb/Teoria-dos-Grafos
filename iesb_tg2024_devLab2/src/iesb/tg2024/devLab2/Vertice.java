package iesb.tg2024.devLab2;

public class Vertice {
	
	private String rotulo;
	private int grau = 0;
	
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

	
	//construtor
	public Vertice(String rotulo) throws Exception {
		
		boolean isRotuloNullOrBranco = rotulo == null || rotulo != null &&
				"".equals(rotulo.trim());
		
		if(isRotuloNullOrBranco) {
			throw new Exception("Não podemos criar vértices sem rótulo!");
		}
		
		this.rotulo = rotulo;		
	}
	
	public void addGrau() {
		this.grau++;
	}


}

