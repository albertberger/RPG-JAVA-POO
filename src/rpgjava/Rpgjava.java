package rpgjava;

import classes.Guerreiro;
import classes.Personagem;
import classes.mago;

public class Rpgjava {

	public static void main (String[] args) {

		mago m1 = new mago("Patolino");
		Guerreiro g1 = new Guerreiro("Bárbaro");

		m1.ataque(g1);
		m1.life();
	}

}