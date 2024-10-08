package iesb.tg2024.devLab2.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {

	private int qtdMaxVertice;
	private int qtdAtualVertice = 0;
	private boolean isQtdMaxDef;
	
	private List<Vertice> vertices = new ArrayList<Vertice>();
	private Map<String, Integer> rotulosIndices = new HashMap<String, Integer>();
	
	private MatrizAdj matrizAdj = null;
	
	public MatrizAdj getMatrizAdj() {
		return this.matrizAdj;
	}
	
	
	//construtor
	public Grafo(int qtdMaxVertice) {
		this.qtdMaxVertice = qtdMaxVertice;
	}
	
	public void addVertice(String rotulo) throws Exception{
		if(qtdAtualVertice <= this.qtdMaxVertice - 1) {
			Vertice vertice = new Vertice(rotulo);
			this.vertices.add(vertice);
			this.rotulosIndices.put(rotulo, this.qtdAtualVertice);
			this.qtdAtualVertice++;
			
		} else {
			new Exception("A quantidade de vertice permitida("+ this.qtdMaxVertice+") foi excedida");
			
		}
	}
	
	public List<Vertice> getVertices(){
		return this.vertices;
	}
	
	public void conectarVertices(String rotuloVerticeInicial, String rotuloVerticeFinal) throws Exception {
		if(!isExisteVertice(rotuloVerticeInicial) || !isExisteVertice(rotuloVerticeFinal)) {
			throw new Exception ("Para adicionar uma aresta ambos os vértices devem existir");
		}
		
		this.criarMatAdj();
		int indiceVerticeFinal = this.rotulosIndices.get(rotuloVerticeInicial);
		int indiceVerticeInicial = this.rotulosIndices.get(rotuloVerticeFinal);
		
		this.matrizAdj.adicionarAresta(indiceVerticeInicial, indiceVerticeFinal);
	}
	
	private void criarMatAdj() {
		if(this.matrizAdj == null) {
			this.matrizAdj = new MatrizAdj(new ArrayList<Vertice>(this.vertices));
		}
	}
	
	private boolean isExisteVertice(String rotuloVertice) {
		int indice = this.rotulosIndices.get(rotuloVertice);
		boolean isVerticeAusente = this.vertices.get(indice) != null ? true : false;
		
		return isVerticeAusente;
	}
	
	public Vertice getVertice(String rotulo) {
		this.isExisteVertice(rotulo);
		int indice = this.rotulosIndices.get(rotulo);
		return this.vertices.get(indice);
	}
	
	public List<Vertice> getGrafoAdjacencias(String vertice){
		// preciso fazer a verificacao se o vertice existe
		int indiceVertice = this.rotulosIndices.get(vertice);
		
		return this.matrizAdj.getAdjacencias(indiceVertice);
	}
	
	// @novo
	public void imprimirMatrizAdjacenciaGrafo() {
		int lengthMatriz = this.matrizAdj.getMatriz().length;
		
		for (int i = 0; i < lengthMatriz; i++) {
			for (int j = 0; j < lengthMatriz; j++) {
				System.out.print(this.matrizAdj.getMatriz()[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
