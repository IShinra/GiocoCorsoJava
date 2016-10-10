package utenteVScomputer;

public class Goku extends Personaggio {
	final static String NOME = "Goku";
	final static int HP = 1000;
	final static int ATTACCO = 50;
	final static int DIFESA = 30;

	public Goku() {
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
