package classes;

public class Guerreiro extends Personagem {

	protected int força = 10;

	public double ataque (){

		incXp();
		int danoRecebido;
		System.out.println("O guerreiro" +nome+ "tomou dano");
		return danoRecebido = força*xp;
	}
	public void ataque(Personagem inimigo){
		System.out.println(nome+ " deu uma espadada " + inimigo.nome);
		int danoRecebido = força*xp;
		inimigo.tomouDano(danoRecebido);
		incXp();
	}
	public Guerreiro (String nome){
		this.nome = nome;
		this.vida = 60;
	}
}