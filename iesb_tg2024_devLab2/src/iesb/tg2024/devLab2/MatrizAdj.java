package iesb.tg2024.devLab2;

import java.util.List;

public class MatrizAdj {
	private int [][] matriz;
	private List<Vertice> vertices;
	private int qtdVertice;
	
	public MatrizAdj(List<Vertice> vertices) {
		this.vertices = vertices;
		this.qtdVertice = vertices.size();
		
		this.inicializarMatriz(0);
    }

    private void inicializarMatriz(int valorInicial) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                this.matriz[i][j] = valorInicial;
            }
        }
	}
    
    public void adicionarAresta(int indiceVerticeInicial, int indiceVerticeFinal) {
        Vertice verticeInicial = this.vertices.get(indiceVerticeInicial);
        Vertice verticeFinal = this.vertices.get(indiceVerticeFinal);

        if (verticeInicial == verticeFinal) {
            this.matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
            verticeInicial.addGrau();

        } else {
            this.matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
            verticeInicial.addGrau();

            this.matriz[indiceVerticeFinal][indiceVerticeInicial] = 1;
            verticeFinal.addGrau();
        }

    }

}
