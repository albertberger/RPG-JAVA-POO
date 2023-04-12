package classes;

public class Personagem {
	protected double vida;
	protected int xp = 1;
	protected String nome;

	public void recupLife (double life){
		if (vida <= 0 ){
			System.out.println("Cura indisponível");
		}
		else {
			this.vida += life;
			System.out.println("O mago se curou");
		}

	}
	public void derrotado (){
		System.out.println(nome + " foi derrotado");
	}
	public void tomouDano(float dano){
		System.out.println(vida);
		this.vida -= dano;

		System.out.println(nome + " tomou dano ");
		System.out.println(vida);
		if (vida <= 0){
			derrotado();
		}
	}
	@Override
	public String toString(){
	return "Personagem"+ "\n"+
		"Nome:"+ nome + "\n"+
		"xp:" + xp + "\n"+
		"Life:" + vida;
}
	public void incXp (){
		this.xp += 1;
	}
}