package Classe;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Animais.Animal;
import Animais.Aprende;
import Animais.Habilidade;
import Animais.Vitoria;
import Interface.IInteragir;

public class Window {

	public static void main(String[] args) {
		
		IInteragir interacao = new Interagir(); 
		Aprende aprende = new Aprende(interacao);
		Vitoria vitoria = new Vitoria(interacao);
		
		Animal animalAquatico = new Animal(aprende, vitoria, "Tubarão", interacao);
		Animal animalTerrestre = new Animal(aprende, vitoria, "Macaco", interacao);
		
		Habilidade habilidade = new Habilidade(animalAquatico, animalTerrestre, "vive na água", interacao);
		
		JFrame frame = new JFrame("Jogo dos animais");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel();
		label.setText("Pense em um animal");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
		
		JButton button = new JButton();
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setText("Ok");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				habilidade.Executar(habilidade);
			}
		});
		
		panel.add(label);
		panel.add(button);
		
		frame.setContentPane(panel);
		
		frame.pack();
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
