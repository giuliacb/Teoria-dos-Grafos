package br.edu.iesb.tg2024.devlab5;

public class DevLab5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 10;
		int E = 15;
		
		Grafo grafo = new Grafo(V, E);
		grafo.arestas[0] = new Aresta(0, 1, 10);
        grafo.arestas[1] = new Aresta(0, 2, 6);
        grafo.arestas[2] = new Aresta(0, 3, 5);
        grafo.arestas[3] = new Aresta(1, 3, 15);
        grafo.arestas[4] = new Aresta(2, 3, 4);
        grafo.arestas[5] = new Aresta(1, 2, 7);
        grafo.arestas[6] = new Aresta(2, 4, 2);
        grafo.arestas[7] = new Aresta(4, 5, 3);
        grafo.arestas[8] = new Aresta(3, 5, 8);
        grafo.arestas[9] = new Aresta(5, 6, 10);
        grafo.arestas[10] = new Aresta(6, 7, 4);
        grafo.arestas[11] = new Aresta(7, 8, 1);
        grafo.arestas[12] = new Aresta(8, 9, 7);
        grafo.arestas[13] = new Aresta(9, 4, 5);
        grafo.arestas[14] = new Aresta(1, 6, 12);
		
		grafo.executarAlgoritmoKrustal();
	}

}
