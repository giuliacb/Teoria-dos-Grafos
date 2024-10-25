package br.edu.iesb.tg2024.devlab5;

import java.util.*;

public class Aresta implements Comparable<Aresta>{
	
	private int origem;
	private int destino;
	private int peso;
	
	public Aresta(int origem, int destino, int peso) {
		this.origem = origem;
		this.destino = destino;
		this.peso = peso;
	}

	@Override
	public int compareTo(Aresta arestaComparada) {
		int diferencaComparada = this.peso - arestaComparada.peso;
		
		return diferencaComparada;
	}
	
	public int getOrigem() {
		return origem;
	}

	public void setOrigem(int origem) {
		this.origem = origem;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

}
