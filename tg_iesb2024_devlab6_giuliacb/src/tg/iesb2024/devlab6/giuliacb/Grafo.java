package tg.iesb2024.devlab6.giuliacb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Grafo {

	int vertices;
	LinkedList<Aresta>[] listaAdjacencia;
	
	Grafo(int vertices){
		this.vertices = vertices;
		listaAdjacencia= new LinkedList[vertices];
		for(int i = 0; i < vertices; i++) {
			listaAdjacencia[i] = new LinkedList<>();
		}
	}
	
	void adicionarAresta(int origem, int destino, int peso) {
		Aresta aresta = new Aresta(origem, destino, peso);
		listaAdjacencia[origem].add(aresta);
		
		listaAdjacencia[destino].add(new Aresta(destino, origem, peso));
	}
	
	//implementando PRIM
	void executarAlgoritmoPRIM() {
		boolean[] inMST = new boolean[vertices];
		
		PriorityQueue<Aresta> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(e -> e.getPeso()));
		
		List<Aresta> mst = new ArrayList<>();
		
		int verticeInicial = 0;
		
		inMST[verticeInicial] = true;
		
		for (Aresta aresta : listaAdjacencia[verticeInicial]) {
			priorityQueue.add(aresta);
		}
		
		while (!priorityQueue.isEmpty()) {
			Aresta arestaAtual = priorityQueue.poll();
			
			if(!inMST[arestaAtual.getDestino()]) {
				mst.add(arestaAtual);
				
				inMST[arestaAtual.getDestino()] = true;
				
				for (Aresta aresta : listaAdjacencia[arestaAtual.getDestino()]) {
					if(!inMST[aresta.getDestino()]) {
						priorityQueue.add(aresta);
					}
				}
			}
		}
		System.out.println(">> Árvore Geradora Mínima (MST:");
		for (Aresta aresta : mst) {
			System.out.println("[PRIM] >> Origem: [" + aresta.getOrigem() + "]"
					+ "Destino: [" + aresta.getDestino() + "]"
					+ "Peso: [" + aresta.getPeso() + "]");
		}
	}
}
