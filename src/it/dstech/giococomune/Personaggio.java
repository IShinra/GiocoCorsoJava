package it.dstech.giococomune;

public abstract class Personaggio implements IPersonaggio {

	protected int hp;
	protected int atk;
	protected int def;
	protected String nome;

	public int pugno() {
		System.out.println("pugno");
		return 10;
	}

	public int calcio() {
		System.out.println("calcio");
		return 10;
	}

	public int atkspc() {
		System.out.println("atkspc");
		return 100;
	}

}
