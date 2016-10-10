package utenteVScomputer;

public abstract class Personaggio implements IPersonaggio {
	protected String nome;
	protected int hp;
	protected int attacco;
	protected int difesa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttacco() {
		return attacco;
	}

	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}

	public int getDifesa() {
		return difesa;
	}

	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}

	@Override
	public int mossa() {
		
		return (int) (attacco + (Math.random()));
	}

	
}
