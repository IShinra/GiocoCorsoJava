package it.dstech.prova;

public class Personaggio extends Caratteristiche implements Stili {
	private int stamina;
	private int atk;
	private int def;

	public Personaggio(int stamina, int atk, int def) {
		this.stamina = stamina;
		this.atk = atk;
		this.def = def;
	}

	public int getHP() {
		return (HPBASE + stamina);
	}

	public int setHP(int danno) {
		return (getHP() - danno);
	}

	public int getATK() {
		return (ATKBASE + atk);
	}

	public int getDEF() {
		return (DEFBASE + def);
	}

	public int khamehameha() {
		return 1000;// danno
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