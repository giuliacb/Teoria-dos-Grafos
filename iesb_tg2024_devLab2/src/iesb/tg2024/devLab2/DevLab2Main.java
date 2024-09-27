package iesb.tg2024.devLab2;

public class DevLab2Main {

	public static void main(String[] args) {
		
		//gerar um grafo G=(V,E)
		
		Grafo grafo = new Grafo(9);
		try {
			grafo.addVertice("DF");
			grafo.addVertice("CA");
			grafo.addVertice("CT");
			grafo.addVertice("UA");
			grafo.addVertice("UB");
			grafo.addVertice("CR");
			grafo.addVertice("RP");
			grafo.addVertice("SC");
			grafo.addVertice("LM");
			
			System.out.println(">> G=(V,E) possui os seguintes vértices: \n");
			for (Vertice vertice : grafo.getVertices()) {
				System.out.println("vertice" + vertice.getRotulo());
			}
			
			grafo.conectarVertices("DF", "CR");
			grafo.conectarVertices("CR", "CT");
			grafo.conectarVertices("CT", "UA");
			
			
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
