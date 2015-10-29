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
                "O animal que voc� pensou " + animal.getCaracteristica() + "?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);
		return jogar == 0 ? true : false;
	}
	
	public static boolean perguntarSeAnimal(String animal){
		
		int jogar = JOptionPane.showConfirmDialog(null,
                "O animal que voc� pensou � um " + animal + "?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);
		return jogar == 0 ? true : false;
	}
	
	public static String digiteCaracteristicaDoAnimal(String novoAnimal, String ultimoAnimalChecado){
		return JOptionPane.showInputDialog("Um(a) " + novoAnimal + "_______ mas um(a) " + ultimoAnimalChecado + " n�o.");
	}
	
	public static String digiteNomeDoAnimal(){
		return JOptionPane.showInputDialog("Qual � o animal que voc� pensou?");
	}
	
	public static void acerteiOAnimal(){
		JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo dos Animais", JOptionPane.DEFAULT_OPTION);
		return;
	}
	
}
