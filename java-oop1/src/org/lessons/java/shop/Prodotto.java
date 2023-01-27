package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva = 20;

	Prodotto(String nome, String descrizione, int prezzo) {
		Random s = new Random();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.codice = s.nextInt();
	}

	public int priceWithoutIva() {
		return prezzo;
	}

	public int priceWithIva() {
		return prezzo + (prezzo * iva / 100);
	}

	public String toString() {
		return nome + " - " + codice + " - " + descrizione;
	}
}
