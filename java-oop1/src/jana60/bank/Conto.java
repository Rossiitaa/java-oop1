package jana60.bank;

public class Conto {
	private int numConto;
	private String nomeProprietario;
	private double saldo;

	Conto(int numConto, String nomeProprietario) {
		this.numConto = numConto;
		this.nomeProprietario = nomeProprietario;
		this.saldo = 0;
	}

	public int getNumConto() {
		return numConto;
	}

	public String nomeProprietario() {
		return nomeProprietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void versamento(double importo) {
		this.saldo += importo;
	}

	public boolean prelevare(double importo) {
		if (importo > this.saldo) {
			return false;
		}
		this.saldo -= importo;
		return true;
	}

	public String getSaldoFormattato() {
		return String.format("€%.2f", saldo);
	}
}
