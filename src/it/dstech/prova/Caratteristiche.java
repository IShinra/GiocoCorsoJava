package it.dstech.prova;

public abstract class Caratteristiche {

	protected final int HPBASE = 100;
	protected final int DEFBASE = 10;
	protected final int ATKBASE = 20;

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
