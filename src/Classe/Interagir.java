package Classe;

import javax.swing.JOptionPane;

import Animal.Animal;
import Interface.IInteragir;

public class Interagir implements IInteragir {

	public boolean Pergunta(String pergunta) {
		return (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog( null, pergunta, "Jogos dos animais", JOptionPane.YES_NO_OPTION));
	}

	public void MostrarVitoria() {
		JOptionPane.showMessageDialog(null, "Acertei de novo", "Jogos dos animais", JOptionPane.INFORMATION_MESSAGE);
	}

	public Animal Aprender(String animalComparacao) {
		Animal animal = new Animal();
		animal.setNome(JOptionPane.showInputDialog(null, "Qual animal você pensou?", "Jogos dos animais", JOptionPane.PLAIN_MESSAGE));
		animal.setHabilidade(JOptionPane.showInputDialog(null,  "Um(a) " + animal.getNome() + " ______ mas um(a) " + animalComparacao + " não.", "Jogos dos animais", JOptionPane.PLAIN_MESSAGE));
		return animal;
	}
	
}
