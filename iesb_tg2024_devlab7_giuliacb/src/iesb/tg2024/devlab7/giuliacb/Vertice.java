package iesb.tg2024.devlab7.giuliacb;

import java.util.Comparator;

public class Vertice implements Comparator<Vertice>{
	
	private int vertice;
	private int custo;
	
	public Vertice() {
		
	}
	
	public Vertice(int vertice, int custo) {
		this.vertice = vertice;
		this.custo = custo;
	}
	
	@Override
	public int compare(Vertice vertice1, Vertice vertice2) {
		if(vertice1.custo < vertice2.custo) {
			return -1;
		}
		
		if(vertice1.custo > vertice2.custo) {
			return 1;
		}
		
		return 0;
	}

	public int getVertice() {
		return vertice;
	}

	public void setVertice(int vertice) {
		this.vertice = vertice;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}
		

}
