package model;

import java.util.ArrayList;

public class AnimalModel {

	private String animal;
	private String caracteristica;
	private ArrayList<AnimalModel> subGrupoAnimais = new ArrayList<AnimalModel>();
	
	public AnimalModel(String caracteristica, String animal){
		this.animal = animal;
		this.caracteristica = caracteristica;
	}	
	

	public void addSubGrupoAnimais(AnimalModel subGrupoAnimais){
		if (subGrupoAnimais==null)
			return;
		
		this.subGrupoAnimais.add( subGrupoAnimais );
	}


	public String getAnimal() {
		return animal;
	}


	public String getCaracteristica() {
		return caracteristica;
	}


	public ArrayList<AnimalModel> getSubGrupoAnimais() {
		return subGrupoAnimais;
	}
	
	
}
