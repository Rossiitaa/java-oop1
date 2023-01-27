package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Inserisci il tuo nome: ");
		String nome = s.nextLine();
		int numConto = (int) (Math.random() * 1000) + 1;
		Conto conto = new Conto(numConto, nome);

		boolean esci = false;

		while (!esci) {
			System.out.println("versamento - prelevare - uscire");
			String scelta = s.nextLine();
			if (scelta.equals("versamento")) {
				System.out.print("Inserisci l'importo da versare: ");
				double importo = s.nextDouble();
				s.nextLine();
				conto.versamento(importo);
				System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
			} else if (scelta.equals("prelevare")) {
				System.out.print("Inserisci l'importo da prelevare: ");
				double importo = s.nextDouble();
				s.nextLine();
				if (!conto.prelevare(importo)) {
					System.out.println("Saldo insufficiente");
				} else {
					System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
				}
			} else if (scelta.equals("uscire")) {
				esci = true;
			} else {
				System.out.println("Mi dispiace, si è verificato un errore");
			}
		}

		s.close();
	}
}