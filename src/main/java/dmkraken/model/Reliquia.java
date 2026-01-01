package dmkraken.model;

import dmkraken.model.enume.Elementos;
import dmkraken.model.enume.SubElementos;

public class Reliquia extends Item {
	
//	private Imagem imagem;
	private String nome;
	private String descricao;
	private Boolean isPassiva;
	//so pode ter um
	private Elementos elemento;
	private SubElementos subElemento;
	//modificador
	
	public Reliquia() {
	}
	
	public Reliquia(String nome, String descricao, Boolean passiva, Elementos elemento, SubElementos subElemento) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.isPassiva = passiva;
		this.elemento = elemento;
		this.subElemento = subElemento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getIsPassiva() {
		return isPassiva;
	}
	public void setIsPassiva(Boolean isPassiva) {
		this.isPassiva = isPassiva;
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
	
	

}
