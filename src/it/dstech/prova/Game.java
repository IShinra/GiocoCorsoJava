package it.dstech.prova;

public class Game {
	public static void main(String args[]) {
		Personaggio pg = new Personaggio(10);
		pg.cammina();
		System.out.println(pg.getHP());
	}

}
