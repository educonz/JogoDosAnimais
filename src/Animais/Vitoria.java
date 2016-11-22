package Animais;

import Classe.Acao;
import Interface.IInteragir;

public class Vitoria extends Acao {

	public Vitoria(IInteragir interagir) {
		super("", interagir);
	}

	@Override
	public Acao Executar(Acao animal) {
		this.getInteragir().MostrarVitoria();
		return animal;
	}
	
}
