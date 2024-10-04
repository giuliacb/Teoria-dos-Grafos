package iesb.tg2024.devLab2.app;

import iesb.tg2024.devLab2.core.Grafo;
import iesb.tg2024.devLab2.core.Vertice;

public class DevLab2Main {

	public static void main(String[] args) {
		
		//gerar um grafo G=(V,E)
		
//		Grafo grafo = new Grafo(9);
//		try {
//			grafo.addVertice("DF");
//			grafo.addVertice("LZ");
//			grafo.addVertice("SB");
//			grafo.addVertice("TG");
//			grafo.addVertice("CI");
//			grafo.addVertice("PL");
//			
//			
//			System.out.println(">> G=(V,E) possui os seguintes vértices: \n");
//			for (Vertice vertice : grafo.getVertices()) {
//				System.out.println("vertice" + vertice.getRotulo());
//			}
//			
//			grafo.conectarVertices("DF", "LZ");
//			grafo.conectarVertices("DF", "SB");
//			grafo.conectarVertices("DF", "TG");
//			grafo.conectarVertices("DF", "CI");
//			grafo.conectarVertices("DF", "PL");
//			
//			System.out.println(">> Grau do vértice DF: " + grafo.getVertice("DF").getGrau());
//			// ...
//			
//			System.out.println(">> O vértice DF possui as seguintes adjacências: ");
//			
//			for(Vertice vertice : grafo.getGrafoAdjacencias("DF")) {
//				System.out.println(vertice.getRotulo() + " ");
//			}			
//			
//			// Imprime a Matriz Adjacencia do Grafo
//			grafo.imprimirMatrizAdjacenciaGrafo();	
//			
		
		//MEU EXEMPLO
		Grafo grafo = new Grafo(10); // Agora temos 10 vértices
        try {
            grafo.addVertice("v1");
            grafo.addVertice("v2");
            grafo.addVertice("v3");
            grafo.addVertice("v4");
            grafo.addVertice("v5");
            grafo.addVertice("v6");
            grafo.addVertice("v7");
            grafo.addVertice("v8");
            grafo.addVertice("v9");
            grafo.addVertice("v10");

            // Exibindo os vértices
            System.out.println(">> G=(V,E) possui os seguintes vértices: \n");
            for (Vertice vertice : grafo.getVertices()) {
                System.out.println("Vértice: " + vertice.getRotulo());
            }

            // Adicionando as arestas direcionadas de acordo com a especificação
            grafo.conectarVertices("v1", "v4");
            grafo.conectarVertices("v1", "v8");
            grafo.conectarVertices("v2", "v3");
            grafo.conectarVertices("v3", "v3"); // Loop
            grafo.conectarVertices("v3", "v6");
            grafo.conectarVertices("v4", "v7");
            grafo.conectarVertices("v4", "v9");
            grafo.conectarVertices("v5", "v1");
            grafo.conectarVertices("v5", "v5"); // Loop
            grafo.conectarVertices("v6", "v5");
            grafo.conectarVertices("v10", "v6");
            grafo.conectarVertices("v10", "v8");
            grafo.conectarVertices("v10", "v10"); // Loop

         // Loop para exibir grau de cada vértice
            System.out.println("\n>> Grau de cada vértice:");
            for (Vertice vertice : grafo.getVertices()) {
                System.out.println(">> Grau do vértice " + vertice.getRotulo() + ": " + vertice.getGrau());
            }

            // Loop para exibir adjacências de cada vértice
            System.out.println("\n>> Adjacências de cada vértice:");
            for (Vertice vertice : grafo.getVertices()) {
                System.out.print(">> O vértice " + vertice.getRotulo() + " possui as seguintes adjacências: ");
                for (Vertice adjacente : grafo.getGrafoAdjacencias(vertice.getRotulo())) {
                    System.out.print(adjacente.getRotulo() + " ");
                }
                System.out.println(); // Quebra de linha para o próximo vértice
            }
            
            
            // Imprimindo a matriz de adjacência
            System.out.println("\n>> Matriz de adjacência:");
            grafo.imprimirMatrizAdjacenciaGrafo();
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
