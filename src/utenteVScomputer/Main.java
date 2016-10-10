package utenteVScomputer;

public class Main {
	final static boolean SCELTA_UTENTE = true;
	final static boolean SCELTA_COMPUTER = false;

	public static void main(String[] args) {
		SceltaPersonaggio sp = new SceltaPersonaggio();
		IPersonaggio pg1 = sp.sceltaPersonaggio(SCELTA_UTENTE);
		IPersonaggio pg2 = sp.sceltaPersonaggio(SCELTA_COMPUTER);

		CombatManager cb = new CombatManager();
		cb.stampaInfo(pg1, pg2);
		cb.combat(pg1, pg2);
	}

}
