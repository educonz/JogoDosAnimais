package Classe;

import javax.swing.JOptionPane;

import Interface.IInteragir;

public class Interagir implements IInteragir {

	public boolean Pergunta(String pergunta) {
		return (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog( null, pergunta + "?", "Jogos dos animais", JOptionPane.YES_NO_OPTION));
	}

	public void MostrarVitoria() {
		JOptionPane.showMessageDialog(null, "Acertei de novo", "Jogos dos animais", JOptionPane.INFORMATION_MESSAGE);
	}

	public String AprenderAnimal(String pergunta) {
		return GetConteudoDialogo(pergunta);
	}
	
	public String AprenderHabilidade(String pergunta) {
		return GetConteudoDialogo(pergunta);
	}
	
	private String GetConteudoDialogo(String pergunta)
	{
		return JOptionPane.showInputDialog(null, pergunta, "Jogos dos animais", JOptionPane.PLAIN_MESSAGE);
	}
}
