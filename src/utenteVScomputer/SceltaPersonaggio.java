package utenteVScomputer;

import java.util.Scanner;
import java.util.Random;

public class SceltaPersonaggio {
	Goku g;
	Vegeta v;

	public IPersonaggio sceltaPersonaggio(boolean n) {
		IPersonaggio pg;
		String player = "";
		String computer = "";
		if (n == true) {
			g = new Goku();
			pg = g;
			player = "true";
			System.out.println(player);
		} else {
			v = new Vegeta();
			pg = v;
			computer = "false";
			System.out.println(computer);
		}

		return pg;
	}

}
