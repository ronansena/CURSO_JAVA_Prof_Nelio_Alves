package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account() {

	}

	public Account(int numeroConta, String nomeCorrentista, double valorInicialDeposito) {
		this.number = numeroConta;
		this.holder = nomeCorrentista;
		deposit(valorInicialDeposito);
	}

	// getters e setters

	public Account(int numeroConta, String nomeCorrentista) {
		this.number = numeroConta;
		this.holder = nomeCorrentista;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	// methods

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}

	public String toString() {
		return "Número da Conta: " + number + " - " + "Nome do correntista: " + holder + " - Valor em conta: "
				+ String.format("%.2f", balance);
	}

}
