package iesb.tg2024.devLab2.core;

import java.util.ArrayList;
import java.util.List;

public class MatrizAdj {
	private int [][] matriz;
	private List<Vertice> vertices;
	private int qtdVertice;
	
	public int [][] getMatriz(){
		return matriz;
	}
	
	public MatrizAdj(List<Vertice> vertices) {
		this.vertices = vertices;
		this.qtdVertice = vertices.size();
		this.matriz = new int[this.qtdVertice][this.qtdVertice];
		
		this.inicializarMatriz(0);
    }

    private void inicializarMatriz(int valorInicial) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                this.matriz[i][j] = valorInicial;
            }
        }
	}
    
    //PARA GRAFO NÃO DIRECIONADO
//    public void adicionarAresta(int indiceVerticeInicial, int indiceVerticeFinal) {
//        Vertice verticeInicial = this.vertices.get(indiceVerticeInicial);
//        Vertice verticeFinal = this.vertices.get(indiceVerticeFinal);
//
//        if (verticeInicial == verticeFinal) {
//            this.matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
//            verticeInicial.addGrau();
//
//        } else {
//            this.matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
//            verticeInicial.addGrau();
//
//            this.matriz[indiceVerticeFinal][indiceVerticeInicial] = 1;
//            verticeFinal.addGrau();
//        }
//
//    }
    
    public void adicionarAresta(int indiceVerticeInicial, int indiceVerticeFinal) {
        Vertice verticeInicial = this.vertices.get(indiceVerticeInicial);

        // Para grafos direcionados, apenas uma direção
        this.matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
        verticeInicial.addGrau();
    }
    
    public List<Vertice> getAdjacencias(int indiceVertice){

		int linha = indiceVertice;
		List<Vertice> adjacencias = new ArrayList<Vertice>();
		
		for (int j = 0; j < this.vertices.size(); j++) {
			if(this.matriz[linha][j] == 1) {
				Vertice vertice = this.vertices.get(j);
				adjacencias.add(vertice);
			}
		}
		
		return adjacencias;
	}	

}
