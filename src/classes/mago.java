package classes;

public class mago extends Personagem {

	protected int magia = 60;
	protected int cura = 25;

	public double ataque(){

		incXp();
		int danoRecebido;
		System.out.println("O mago" +nome+ "tomou dano");
		return danoRecebido = magia*xp;
	}
	public void ataque(Personagem inimigo){
		System.out.println(nome+ " lançou um avada kedavra no " + inimigo.nome);
		int danoRecebido = magia*xp;
		inimigo.tomouDano(danoRecebido);
		incXp();
	}
	public void life(){
		recupLife(vida);
	}
	public mago (String nome){
		this.nome = nome;
		this.vida = 40;
}
}