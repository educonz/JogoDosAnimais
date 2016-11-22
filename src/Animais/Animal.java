package Animais;

import Classe.Acao;
import Interface.IInteragir;

public class Animal extends Acao {
	
	private Acao vitoria;
	private Acao aprende;
	
	public Animal(Aprende aprende, Vitoria vitoria, String animal, IInteragir interacao) {
		super(animal, interacao);
		this.vitoria = vitoria;
		this.aprende = aprende;
	}

	@Override
	public Acao Executar(Acao habilidade) {
		if (MostraPergunta("O animal que você pensou foi ", getDescricao()))
			return this.vitoria.Executar(this);
		else
			return this.aprende.Executar(this);
	}
}
