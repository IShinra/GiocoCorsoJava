package it.dstech.prova;

public class Game {
	public static void main(String args[]) {

		Personaggio pg = new Personaggio(10, 10, 10);
		pg.cammina();
		pg.pugno();
		System.out.println("HP ; HPBASE " + pg.HPBASE + " - " + pg.getHP());
		System.out.println("DEF ; DEFBASE " + pg.DEFBASE + " - " + pg.getDEF());
		System.out.println("ATK ; ATKBASE " + pg.ATKBASE + " - " + pg.getATK());
		System.out.println("DANNO ATTACCO SPECIALE " + pg.khamehameha());
		System.out.println(
				"HAI SUBITO UN DANNO DI " + pg.khamehameha() + ",ORA HAI " + pg.setHP(pg.khamehameha()) + "HP");

	}
}

/*
 * dopo ogni modifica : commit. scelgo la classe che voglio committare
 * (consiglia quelle modificate). messaggio (commit) comprensibile.
 * 
 */