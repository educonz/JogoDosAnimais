package Teste;

import Animal.Animal;
import Interface.IInteragir;

public class InteragirPerguntaFalseTest implements IInteragir {

	public boolean Pergunta(String pergunta) {
		return false;
	}

	public void MostrarVitoria() {		
	}

	public Animal Aprender(String animalComparacao) {
		return null;
	}

}
