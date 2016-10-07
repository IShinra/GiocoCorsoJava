package it.dstech.prova;

public class Personaggio extends Caratteristiche implements Stili {
	private int stamina;
	private int atk;
	private int def;
	private String nome;

	public Personaggio(String nome, int stamina, int atk, int def) {
		this.stamina = stamina;
		this.atk = atk;
		this.def = def;
		this.setNome(nome);
	}

	public static void combact(Personaggio p, Personaggio p2) {
		System.out.println("Goku : " + p.setHP(p2.pugno(p2)));
		System.out.println("Naruto : " + p2.setHP(p.calcio(p)));

		if (p.getHP() > p2.getHP())
			System.out.println("Vincitore : " + p.getNome());

		else
			System.out.println("Vincitore : " + p2.getNome());
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int pugno(Personaggio p) {
		int danno;
		danno = (p.getATK() + 50) - p.getDEF();
		return danno;
	}

	@Override
	public int calcio(Personaggio p) {
		int danno;
		danno = (p.getATK() + 70) - p.getDEF();
		return danno;
	}

	@Override
	public int atkspc(Personaggio p) {
		int danno;
		danno = (p.getATK() + 100) - p.getDEF();
		return danno;
	}

}
