package controller;


import pane.AnimalPane;
import model.AnimalModel;

public class JogarAnimaisController {
	
	private static AnimalModel grupoAnimais;
	private static AnimalModel ultimoGrupoAnimais;
	private static boolean finalizarProcesso;
	
	private enum StatusProcesso {
		ACERTEI(0), 
		ADICIONAR_NOVO_SUB_GRUPO_DE_ANIMAL(1);
		
		int status;
		private StatusProcesso(int valor){
			status = valor;
		}
		
		private void execute(){
			switch ( status ) {
				case 0:
					AnimalPane.acerteiOAnimal();
					break;
	
				case 1:
					AprenderAnimaisController.aprenderNovoGrupoAnimal(ultimoGrupoAnimais);
					break;					
			}
		}
	}
	
	public JogarAnimaisController(){
		if (grupoAnimais==null) 
			grupoAnimais = AprenderAnimaisController.grupoDefault();
		
		AprenderAnimaisController.aprenderAnimaisPadrao(grupoAnimais);
	}
	
	//Processando jogo
	public void jogar(){
		finalizarProcesso = false;
		processandoAnimais();
	}
	
	public void processandoAnimais(){
		ultimoGrupoAnimais = grupoAnimais;
		conheceAlgumSubGrupo(grupoAnimais);		
	}
	
	public static void conheceAlgumSubGrupo(AnimalModel animal){
		
		if ( animal.getSubGrupoAnimais().size() > 0 ) {
			
			AnimalModel caracteristicaAnimalConhecida = checandoSubGrupoAnimal(animal);
			if ( caracteristicaAnimalConhecida != null){
				ultimoGrupoAnimais = caracteristicaAnimalConhecida;
				conheceAlgumSubGrupo(caracteristicaAnimalConhecida);
			}
			
		}
		
		if (finalizarProcesso == true) {
			return;
		}
		
		conheceAnimal(animal);
	}
	
	public static AnimalModel checandoSubGrupoAnimal(AnimalModel animal){
		for ( AnimalModel subAnimal : animal.getSubGrupoAnimais() ) {
			
			if ( conheceCaracteristicaAnimal(subAnimal) ) {
				return subAnimal;
			}
			
		}
		return null;
	}
	
	public static boolean conheceCaracteristicaAnimal(AnimalModel animais){
		if ( AnimalPane.perguntarCaracteristicaDoAnimal( animais ) ) {
			return true; 
		}
		return false;
	}
	
	public static void conheceAnimal(AnimalModel animal){
		if ( AnimalPane.perguntarSeAnimal( animal.getAnimal() ) ) {
			StatusProcesso.ACERTEI.execute();
		}else{
			StatusProcesso.ADICIONAR_NOVO_SUB_GRUPO_DE_ANIMAL.execute();
		}
		finalizarProcesso = true;
	}
	
	
	

}
