package it.dstech.prova;

public abstract class Caratteristiche {

	private final int hp = 100;
	private final int def = 10;
	private final int atk = 20;

	public void cammina() {
		System.out.println("cammina");
	}

	public void corri() {
		System.out.println("corri");
	}

	public void salta() {
		System.out.println("salta");
	}
}
