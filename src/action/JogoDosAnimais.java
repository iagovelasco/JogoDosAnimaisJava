package action;

import controller.JogarAnimaisController;
import pane.AnimalPane;

public class JogoDosAnimais {

	

	public static void main(String[] args) {
				
		JogarAnimaisController jogoDosAnimais = new JogarAnimaisController();
		
		while ( AnimalPane.comecarJogar() == true ) {
			
			jogoDosAnimais.jogar();
			
		}
		
		System.exit(0);
	}

}
