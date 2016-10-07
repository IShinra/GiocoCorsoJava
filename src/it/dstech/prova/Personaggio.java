package it.dstech.prova;

public class Personaggio extends Caratteristiche implements Stili {

	private int stamina;
	private int atk;
	private int def;
	private String nome;
	private int hpTotali;
	

	public Personaggio(String nome, int stamina, int atk, int def) {
		this.stamina = stamina;
		this.atk = atk;
		this.def = def;
		this.nome = nome;
		this.hpTotali = stamina + HPBASE;
		
	}

	public static void combact(Personaggio p, Personaggio p2) {
		boolean giocoFinito = false;
		System.out.println("la vita massima di " + p.getNome() + " è " + p.getHpTotali() );
		System.out.println("la vita massima di " + p2.getNome() + " è " + p2.getHpTotali() );
		while (giocoFinito == false){
			int x=p2.pugno(p2);
			int y=p.calcio(p);
			System.out.println("Naruto usa pugno potenza pari a: " + x );
			p.setHpTotali(p.hpTotali - x);
			System.out.println("vita rimasta a Goku : " + p.getHpTotali() );
			
			System.out.println("Goku usa calcio potenza pari a: " + y);
			p2.setHpTotali(p2.hpTotali - y);
			System.out.println("vita rimasta a Naruto : " + p2.getHpTotali() );

			if (p.getHpTotali() <= 0 || p2.getHpTotali() <= 0) {

				if (p.getHpTotali() < p2.getHpTotali()) {
					System.out.println("il vincitore è: " + p2.getNome());
					giocoFinito = true;
				} else {
					System.out.println("il vincitore è: " + p.getNome());
					giocoFinito = true; 
				}
			} else if (p.getHpTotali() == 0 && p.getHpTotali() == 0) {
				System.out.println("Pareggio");
				giocoFinito = true; 
			}
		} 

	}

	/*
	 * public int getHP() { return (HPBASE + stamina); }
	 * 
	 * public void setHP(int danno) { getHP() -= danno;
	 * 
	 * }
	 */

	public int getHpTotali() {
		
		return hpTotali;
	}

	public void setHpTotali(int hpTotali) {
		this.hpTotali = hpTotali;
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
		danno = (p.randomCritico(p) + 50);
		danno -= getDEF();		
		return danno;
	}

	@Override
	public int calcio(Personaggio p) {
		int danno;
		danno = (p.randomCritico(p) + 70);
		danno -= getDEF();	
		return danno;
	}

	@Override
	public int atkspc(Personaggio p) {
		int danno;
		danno = (p.randomCritico(p) + 10);
		danno -= getDEF();	
		return danno;
	}

	public int randomCritico(Personaggio p) {
		int attaccoMax = p.getATK();
		int range = (int) (0 + Math.random() * attaccoMax);
		if (range == attaccoMax)
			System.out.println("che culo hai fatto un colpo di cristo(critico)!!!:)");
		return range;
	}

}
