package it.dstech.prova;

public class Personaggio extends Caratteristiche implements Stili {
	private int stamina;

	public Personaggio(int stamina) {
		super();
		this.stamina = stamina;
	}

	@Override
	public void pugno() {
		System.out.println("pugno");

	}

	@Override
	public void calcio() {
		System.out.println("calcio");

	}

	@Override
	public void atkspc() {
		System.out.println("atkspc");

	}

}
