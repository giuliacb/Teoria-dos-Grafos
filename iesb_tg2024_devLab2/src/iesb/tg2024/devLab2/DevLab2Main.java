package iesb.tg2024.devLab2;

public class DevLab2Main {

	public static void main(String[] args) {
		
		//gerar um grafo G=(V,E)
		
		Grafo grafo = new Grafo(9);
		try {
			grafo.addVertice("DF");
			grafo.addVertice("LZ");
			grafo.addVertice("SB");
			grafo.addVertice("TG");
			grafo.addVertice("CI");
			grafo.addVertice("PL");
			
			
			System.out.println(">> G=(V,E) possui os seguintes vértices: \n");
			for (Vertice vertice : grafo.getVertices()) {
				System.out.println("vertice" + vertice.getRotulo());
			}
			
			grafo.conectarVertices("DF", "LZ");
			grafo.conectarVertices("DF", "SB");
			grafo.conectarVertices("DF", "TG");
			grafo.conectarVertices("DF", "CI");
			grafo.conectarVertices("DF", "PL");
			
			System.out.println(">> Grau do vértice DF: " + grafo.getVertice("DF").getGrau());
			// ...
			
			System.out.println(">> O vértice DF possui as seguintes adjacências: ");
			
			for(Vertice vertice : grafo.getGrafoAdjacencias("DF")) {
				System.out.println(vertice.getRotulo() + " ");
			}			
			
			// Imprime a Matriz Adjacencia do Grafo
			grafo.imprimirMatrizAdjacenciaGrafo();	
			
			
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
