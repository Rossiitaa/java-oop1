package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {

		Prodotto p1 = new Prodotto("Aragosta irachena", "Va bollita viva, cercherà di scappare", 100);
		System.out.println(p1.toString());
		int p1Price = p1.priceWithoutIva();
		int p1PriceIva = p1.priceWithIva();
		System.out.println("Prezzo senza IVA: " + p1Price + "€" + "; " + "Prezzo con IVA: " + p1PriceIva + "€");

		Prodotto p2 = new Prodotto("Corso Boolean", "Ti formano per il mondo del lavoro", 3500);
		System.out.println(p2.toString());
		int p2Price = p2.priceWithoutIva();
		int p2PriceIva = p2.priceWithIva();
		System.out.println("Prezzo senza IVA: " + p2Price + "€" + "; " + "Prezzo con IVA: " + p2PriceIva + "€");
	}
}
