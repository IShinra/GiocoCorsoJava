package it.dstech.prova;

public class Personaggio extends Caratteristiche implements Stili {
	private int stamina,difesa,attacco;

	public Personaggio(int stamina,int difesa, int attacco) {
		super();
		this.stamina = stamina;
		this.difesa = difesa;
		this.attacco = attacco;
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
	
	public int getHP(){
		return (hp + stamina);
	}
	
	public int getDEF(){
		return (def + difesa);
	}
	
	public int getATK(){
		return (atk + attacco);
	}
	public int khamehameha(){
		return 110;
	}

}
