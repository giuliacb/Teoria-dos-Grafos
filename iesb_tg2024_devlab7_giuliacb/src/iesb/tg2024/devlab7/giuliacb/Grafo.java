package iesb.tg2024.devlab7.giuliacb;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Grafo {
	
	private int arrayDistancias[];
	private Set<Integer> conjuntoProcessado;
	private PriorityQueue<Vertice> priorityQueue;
	
	//num de vertices do grafo G(V,E)
	private int qtdVertices;
	List<List<Vertice>> matrizAdj;
	
	public Grafo(int qtdVertices) {
		this.qtdVertices = qtdVertices;
		this.arrayDistancias = new int [qtdVertices];
		this.conjuntoProcessado = new HashSet<Integer>();
		this.priorityQueue = new PriorityQueue<Vertice>(qtdVertices, new Vertice());
	}
	
	//percorrer todos os vertices vizinhos do vertice de origem analisado
	public void percorrerVerticeVizinho(int verticeOrigem) {
		int distanciaAresta = 1;
		int novaDistancia = -1;
		
		//analisa todos os vizinhos de um vertice
		for (int i = 0; i < this.matrizAdj.get(verticeOrigem).size(); i++) {
			Vertice vertice = this.matrizAdj.get(verticeOrigem).get(i);
			
			//verifica se o atual vertice ainda não foi processado
			if(!this.conjuntoProcessado.contains(vertice.getVertice())) {
				distanciaAresta = vertice.getCusto();
				novaDistancia = this.arrayDistancias[verticeOrigem] + distanciaAresta;
				
				//verifica se a nova distancia é minima (custo)
				if(novaDistancia < this.arrayDistancias[vertice.getVertice()]) {
					this.arrayDistancias[vertice.getVertice()] = novaDistancia;
				}
				
				//adiciona o vertice atual na fila de prioridade 
				this.priorityQueue.add(new Vertice(vertice.getVertice(), this.arrayDistancias[vertice.getVertice()]));
			}
		}
	}
	
	public int[] getArrayDistancias() {
		return arrayDistancias;
	}
	
	
	//algoritmo dijkstra
	public void executarAlgoritmoDijkstra(List<List<Vertice>> adj, int origem) {
		this.matrizAdj = adj;
		
		for(int i = 0; i < this.qtdVertices; i++) {
			this.arrayDistancias[i] = Integer.MAX_VALUE;
		}
		
		//add o vertice de origem ao obj priority queue
		this.priorityQueue.add(new Vertice(origem, 0));
		
		//distancia ate o vertice de origem é zero
		this.arrayDistancias[origem] = 0;
		
		while(this.conjuntoProcessado.size() != this.qtdVertices) {
			//verifica se o obj priority queue foi totalemnte percorrido
			if(this.priorityQueue.isEmpty())
				return;
			
			//remove o vertice de distancia minima da fila de prioridade 
			int verticeRemovido = this.priorityQueue.remove().getVertice();
			
			
			//verifica se o vertice já teve sua distancia computada
			if(this.conjuntoProcessado.contains(verticeRemovido)) {
				continue;
			}
			
			//add o vertice cuja distancia ja foi computada
			this.conjuntoProcessado.add(verticeRemovido);
			
			this.percorrerVerticeVizinho(verticeRemovido);
		}
	}
}
