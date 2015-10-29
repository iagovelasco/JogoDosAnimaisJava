package controller;

import pane.AnimalPane;
import model.AnimalModel;

public class AprenderAnimaisController {

	
	public static void aprenderAnimaisPadrao(AnimalModel arrayGrupoAnimais){	
		adicionarSubGrupoAnimal(arrayGrupoAnimais, new AnimalModel("vive na água", "Tubarão") );
		return;
	}
	
	public static AnimalModel grupoDefault(){
		return new AnimalModel("", "Macaco");
	}
	
	public static void adicionarSubGrupoAnimal(AnimalModel arraySubGrupoAnimais, AnimalModel novoAnimal){
		if ( novoAnimal!=null && checkNotNullAndEmpty(novoAnimal.getAnimal()) && checkNotNullAndEmpty(novoAnimal.getCaracteristica()) ) {
			arraySubGrupoAnimais.addSubGrupoAnimais(novoAnimal);
		}		
		return;
	}
	
	public static void aprenderNovoGrupoAnimal(AnimalModel arraySubGrupoAnimais){
		String novoAnimal =  AnimalPane.digiteNomeDoAnimal() ;
		if ( checkNotNullAndEmpty(novoAnimal) ){
			String caracteristica = AnimalPane.digiteCaracteristicaDoAnimal( novoAnimal, arraySubGrupoAnimais.getAnimal() ) ;
			arraySubGrupoAnimais.addSubGrupoAnimais(new AnimalModel(caracteristica, novoAnimal) );
		}
		return;
	}
	
	public static boolean checkNotNullAndEmpty(String valor){
		return valor!=null && !valor.equalsIgnoreCase("") ? true : false;
	}
	
}
