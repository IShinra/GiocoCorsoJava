package it.dstech.prova;

public class Game {
	public static void main(String args[]) {

		Personaggio goku = new Personaggio("Goku", 1000, 10, 10);
		Personaggio naruto = new Personaggio("Naruto",1000,10, 10);

		/*
		 * pg.cammina(); pg.pugno(); System.out.println("HP ; HPBASE " +
		 * pg.HPBASE + " - " + pg.getHP()); System.out.println("DEF ; DEFBASE "
		 * + pg.DEFBASE + " - " + pg.getDEF()); System.out.println(
		 * "ATK ; ATKBASE " + pg.ATKBASE + " - " + pg.getATK());
		 * System.out.println("DANNO ATTACCO SPECIALE " + pg.khamehameha());
		 * System.out.println( "HAI SUBITO UN DANNO DI " + pg.khamehameha() +
		 * ",ORA HAI " + pg.setHP(pg.khamehameha()) + "HP");
		 */

		/*
		 * System.out.println("Goku's HP : " + goku.getHP());
		 * System.out.println("Naruto's HP : " + naruto.getHP());
		 * System.out.println("Goku engage Naruto. Naruto has : " +
		 * naruto.setHP(goku.getATK())); System.out.println(
		 * "Naruto engage Goku. Naruto has : " + goku.setHP(naruto.getATK()));
		 */

		Personaggio.combact(goku, naruto);
	}
}
