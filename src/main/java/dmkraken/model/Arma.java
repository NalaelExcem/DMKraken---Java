package dmkraken.model;

import java.util.ArrayList;

import dmkraken.model.enume.Atributos;
import dmkraken.model.enume.Dados;
import dmkraken.model.enume.Elementos;
import dmkraken.model.enume.SubElementos;

public class Arma extends Item {
	
//	private Imagem imagem;
	private String nome;
	private ArrayList<Dados> ataque;
	//alcance de ataque da arma em metros
	private Integer alcance;
	private Atributos atributoModificador;
	private Elementos elemento;
	private SubElementos subElemento;
	private Boolean equipado;
	
	public Arma() {}
	
	public Arma(String nome, ArrayList<Dados> ataque, Integer alcance, Atributos atributoModificador,
			Elementos elemento, SubElementos subElemento, Boolean equipado) {
		super();
		//para evitar cadastrar elemento + subelemento
		if(elemento != null && subElemento != null) {
			//nothing = null
		}
		else {
			this.nome = nome;
			this.ataque = ataque;
			this.alcance = alcance;
			this.atributoModificador = atributoModificador;
			this.elemento = elemento;
			this.subElemento = subElemento;
			this.equipado = equipado;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Dados> getAtaque() {
		return ataque;
	}

	public void setAtaque(ArrayList<Dados> ataque) {
		this.ataque = ataque;
	}

	public Integer getAlcance() {
		return alcance;
	}

	public void setAlcance(Integer alcance) {
		this.alcance = alcance;
	}

	public Atributos getAtributoModificador() {
		return atributoModificador;
	}

	public void setAtributoModificador(Atributos atributoModificador) {
		this.atributoModificador = atributoModificador;
	}

	public Elementos getElemento() {
		return elemento;
	}

	public void setElemento(Elementos elemento) {
		this.elemento = elemento;
	}

	public SubElementos getSubElemento() {
		return subElemento;
	}

	public void setSubElemento(SubElementos subElemento) {
		this.subElemento = subElemento;
	}

	public Boolean getEquipado() {
		return equipado;
	}

	public void setEquipado(Boolean equipado) {
		this.equipado = equipado;
	}

}
