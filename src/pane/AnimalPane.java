package pane;

import javax.swing.JOptionPane;

import model.AnimalModel;

public class AnimalPane {

	public static boolean comecarJogar(){
		int jogar = JOptionPane.showConfirmDialog(null,
                "Pense em um animal", "Jogo dos Animais", JOptionPane.DEFAULT_OPTION);
		return jogar == 0 ? true : false;
	}
	
	public static boolean perguntarCaracteristicaDoAnimal(AnimalModel animal){
		
		int jogar = JOptionPane.showConfirmDialog(null,
                "O animal que você pensou " + animal.getCaracteristica() + "?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);
		return jogar == 0 ? true : false;
	}
	
	public static boolean perguntarSeAnimal(String animal){
		
		int jogar = JOptionPane.showConfirmDialog(null,
                "O animal que você pensou é um " + animal + "?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);
		return jogar == 0 ? true : false;
	}
	
	public static String digiteCaracteristicaDoAnimal(String novoAnimal, String ultimoAnimalChecado){
		return JOptionPane.showInputDialog("Um(a) " + novoAnimal + "_______ mas um(a) " + ultimoAnimalChecado + " não.");
	}
	
	public static String digiteNomeDoAnimal(){
		return JOptionPane.showInputDialog("Qual é o animal que você pensou?");
	}
	
	public static void acerteiOAnimal(){
		JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo dos Animais", JOptionPane.DEFAULT_OPTION);
		return;
	}
	
}
