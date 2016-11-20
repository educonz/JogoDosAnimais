package Teste;

import Animal.Animal;
import Interface.IInteragir;

public class InteragirPerguntaTrueTest implements IInteragir {

	public boolean Pergunta(String pergunta) {
		return true;
	}

	public void MostrarVitoria() {
	}

	public Animal Aprender(String animalComparacao) {
		return null;
	}
}