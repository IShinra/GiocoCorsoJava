package utenteVScomputer;

public class Vegeta extends Personaggio {
	final static String NOME = "Vegeta";
	final static int HP = 1000;
	final static int ATTACCO = 60;
	final static int DIFESA = 30;

	public Vegeta() {
		nome = NOME;
		hp = HP;
		attacco = ATTACCO;
		difesa = DIFESA;
		setNome(nome);
		setHp(hp);
		setAttacco(attacco);
		setDifesa(difesa);

	}
}
