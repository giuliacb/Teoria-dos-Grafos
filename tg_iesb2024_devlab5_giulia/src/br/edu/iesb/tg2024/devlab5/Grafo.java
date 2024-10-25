package br.edu.iesb.tg2024.devlab5;

import java.util.Arrays;

public class Grafo {
	
	private int qtdVertices;
	private int qtdArestas;
	Aresta[] arestas;
	
	public Grafo(int qtdVertices, int qtdArestas) {
		super();
		this.qtdVertices = qtdVertices;
		this.qtdArestas = qtdArestas;
		this.arestas = new Aresta[qtdArestas];
	}
	
	public int buscar(int[] parent, int i) {
		if(parent[i] == -1) {
			return i;
		}
		
		return buscar(parent, parent[i]);
	}
	
	public void unirConjuntos(int[] parent, int x, int y) {
		int conjuntoX= buscar(parent, x);
		int conjuntoY = buscar(parent, y);
		parent[conjuntoX] = conjuntoY;
	}
	
	public void executarAlgoritmoKrustal() {
		Aresta[] resultado = new Aresta[this.qtdVertices - 1];
		int e = 0;
		int i = 0;
		Arrays.sort(this.arestas);
		
		int [] parent = new int[this.qtdVertices];
		Arrays.fill(parent, -1);
		
		while(e<(this.qtdVertices - 1)) {
			Aresta proximaAresta = this.arestas[i++];
			int x = buscar(parent, proximaAresta.getOrigem());
			int y = buscar(parent, proximaAresta.getDestino());
			
			if(x != y) {
				resultado[e++] = proximaAresta;
				unirConjuntos(parent, x, y);
			}
		}
		
		System.out.println(">> Arestas da Árvore Geradora Mínima: ");
		for(int z = 0; z<e; z++) {
			System.out.println(">> Origem: [" + resultado[z].getOrigem() + "]"
					+ " Destino: [" + resultado[z].getDestino() + "]"
					+ " Resltado: [" + resultado[z].getPeso() + "]");
		}
	}

}
