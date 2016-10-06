package it.dstech.prova;

public class Game {
	public static void main(String args[]) {
		Personaggio pg = new Personaggio(10,20,30);
		pg.cammina();
		pg.getHP();
		pg.getDEF();
		pg.getATK();
		pg.khamehameha();
		System.out.println("vita: " + pg.getHP());
		System.out.println("difesa: " + pg.getDEF());
		System.out.println("attacco: " + pg.getATK());
		System.out.println("danno khamehameha: " +pg.khamehameha());
	}

}
