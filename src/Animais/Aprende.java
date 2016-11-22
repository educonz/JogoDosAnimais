package Animais;

import Classe.Acao;
import Interface.IInteragir;

public class Aprende extends Acao {

	public Aprende(IInteragir interagir) {
		super("", interagir);
	}

	@Override
	public Acao Executar(Acao animalAntigo) {
	    String animal = this.getInteragir().AprenderAnimal("Qual animal você pensou?");
	    String habilidade = this.getInteragir().AprenderHabilidade("O que um(uma) " + animal + " faz que o " + animalAntigo.getDescricao() + " não?");
		return CriaNovaHabilidade(animalAntigo, animal, habilidade);
	}
	
	private Habilidade CriaNovaHabilidade(Acao animalAntigo, String animal, String habilidade)
	{
		Animal novoAnimal = new Animal(this,new Vitoria(this.getInteragir()), animal, this.getInteragir());
		return new Habilidade(novoAnimal, animalAntigo, habilidade, this.getInteragir());
	}
}
